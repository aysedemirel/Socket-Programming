package com.socket.basic;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  private static final int PORT = 8000;

  public Server() {
    System.out.println("Server started...");
    try {
      ServerSocket serverSocket = new ServerSocket(PORT);
      Socket socket = serverSocket.accept(); // establishes connection
      DataInputStream dis = new DataInputStream(socket.getInputStream());
      String message = (String) dis.readUTF();
      System.out.println("Message from client : " + message);
      dis.close();
      socket.close();
      serverSocket.close();
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  public static void main(String[] args) {
    new Server();
  }
}
