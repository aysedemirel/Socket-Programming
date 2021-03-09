package com.socket.multiserver;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Server extends Thread {
  public static final int PORT_NUMBER = 8081;
  public static JFrame f = new JFrame();// creating instance of JFrame

  protected Socket socket;

  Server(Socket socket) {
    this.socket = socket;
    System.out.println("New client connected from " + socket.getInetAddress().getHostAddress());
    start();
  }

  public void run() {
    InputStream in = null;
    OutputStream out = null;
    try {
      in = socket.getInputStream();
      out = socket.getOutputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      String request;

      while ((request = br.readLine()) != null) {
        System.out.println("server-data: " + request);
        char[] covert = request.toCharArray();
        char c = covert[0];
        int i = 0;
        if ("q".equals(request)) {
          System.exit(0);
          break;
        }
        while (c != '\0') {
          if (c >= 65 && c <= 90) { // A-Z
            covert[i] = (char) (covert[i] - 3);
            if (covert[i] > 90)
              covert[i] = (char) ((covert[i] % 90) + 65);
          }
          if (covert[i] < 65)
            covert[i] = (char) (covert[i] + 26);
          if (c >= 97 && c <= 122) {
            covert[i] = (char) (covert[i] - 3);
            if (covert[i] > 122)
              covert[i] = (char) ((covert[i] % 122) + 97);
          }
          if (covert[i] < 97 && covert[i] >= 91) // a-z
            covert[i] = (char) (covert[i] + 26); // out of a-z,we are adding 26(number of the a-z
                                                 // group) to return the a-z
          if (c == 32)
            covert[i] = c;
          i++;
          if (i < covert.length)
            c = covert[i];
          else
            break;
        }
        request = String.valueOf(covert);
        System.out.println("server-decrypted data: " + request);
        request += '\n';
        out.write(request.getBytes());
      }

    } catch (IOException ex) {
      System.out.println("Unable to get streams from client");
    } finally {
      try {
        in.close();
        out.close();
        socket.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }


  public static void main(String[] args) {
    int x = 12;
    System.out.println("How many servers do you want ?");
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();
    reader.close();
    for (int i = 1; i <= n; i++) {
      MultithreadingDemo object = new MultithreadingDemo(i, x);
      object.start();
      x += 255;
    }

    f.setSize(1500, 715);// 400 width and 500 height
    f.setLayout(null);// using no layout managers
    f.setVisible(true);// making the frame visible
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}


class MultithreadingDemo extends Thread {
  public static final int PORT_NUMBER = 8081;
  int x = 12;
  static Border blackline = BorderFactory.createLineBorder(Color.black);
  public int count = 0;

  public MultithreadingDemo(int i, int xx) {
    // TODO Auto-generated constructor stub
    count = i;
    x = xx;
  }

  public void run() {
    System.out.println("SocketServer Example" + count);
    ServerSocket server = null;

    try {
      server = new ServerSocket(PORT_NUMBER + count);
      System.out.println(PORT_NUMBER + count);
      JPanel panel2 = panelCreate(255, x);
      for (int i = 0; i < 4; i++) {
        JTextArea text = new JTextArea();
        text.setText("deneme");
        text.setEditable(false);
        panel2.add(text);
      }
      while (true) {
        new Server(server.accept());
      }
    } catch (IOException ex) {
      System.out.println("Unable to start server.");
    } finally {
      try {
        if (server != null)
          server.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }

  public static JPanel panelCreate(int i, int x) {
    JPanel panelLeft = new JPanel();
    panelLeft.setBorder(blackline);
    panelLeft.setBackground(Color.GRAY);
    panelLeft.setSize(250, 645);
    panelLeft.setLocation(x + i, 12);
    Server.f.add(panelLeft);
    return panelLeft;
  }
}
