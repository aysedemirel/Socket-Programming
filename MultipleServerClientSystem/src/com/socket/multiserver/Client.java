package com.socket.multiserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// change port numbers
public class Client {

  public static void main(String args[]) {
    String host = "127.0.0.1";
    int port = 8083;
    new Client(host, port);
  }

  public Client(String host, int port) {
    try {
      String serverHostname = new String("127.0.0.1"); // localhost address
      Socket echoSocket = null;
      PrintWriter out = null;
      BufferedReader in = null;

      System.out.println("Connecting to host " + serverHostname + " on port " + port + ".");

      try {
        echoSocket = new Socket(serverHostname, 8083);
        out = new PrintWriter(echoSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
      } catch (UnknownHostException e) {
        System.err.println("Unknown host: " + serverHostname);
        System.exit(1);
      } catch (IOException e) {
        System.err.println("Unable to get streams from server");
        System.exit(1);
      }
      // read from console
      BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

      while (true) {
        String userInput = stdIn.readLine();
        System.out.println("client-data: " + userInput);
        // Exit if 'q'
        out.println(userInput);
        if ("q".equals(userInput)) {
          break;
        }
        System.out.println("client-decrypted data: " + in.readLine());
      }
      out.close();
      in.close();
      stdIn.close();
      echoSocket.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
