package com.socket.decrypted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Client sends encrypted messages and receives decrypted messages from server <br>
 * 
 * q is an exit keyword, it will close the connection
 * 
 * Before starting the client, start the server-side. Otherwise client will close itself.
 * 
 * Encrypting method: Caesar cipher
 * 
 * @author aysedemirel
 */
public class Client {
  private static final String HOST = "127.0.0.1"; // localhost address
  private static final int PORT = 8081;
  private static final String EXIT_CODE = "q";

  private Socket socket = null;
  private PrintWriter socketOut = null;
  private BufferedReader socketIn = null;
  private BufferedReader userIn = null;

  public Client(String host, int port) {
    boolean isConnected = initConnection();
    if (!isConnected) {
      System.exit(0);
    }
    readFromConsole();
    closeConnection();
  }

  private boolean initConnection() {
    boolean isConnected = false;
    System.out.println("Connecting to host " + HOST + " on port " + PORT + ".");
    try {
      socket = new Socket(HOST, PORT);
      socketOut = new PrintWriter(socket.getOutputStream(), true);
      socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      isConnected = true;
    } catch (UnknownHostException e) {
      System.err.println("Unknown host: " + HOST);
    } catch (IOException e) {
      System.err.println("Unable to get streams from server");
    }
    return isConnected;
  }

  private void readFromConsole() {
    // read from console
    userIn = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String userInput;
      try {
        userInput = userIn.readLine();
        System.out.println("client-data: ".toUpperCase() + userInput);
        socketOut.println(userInput);
        if (isExitCode(userInput)) {
          // Exit if 'q'
          break;
        }
        System.out.println("client-decrypted data: ".toUpperCase() + socketIn.readLine());
      } catch (IOException e) {
        // If there is a IOException, finish the operation
        System.err.println("Socket IO exception (Reason: userIn or socketOut)");
        break;
      }
    }
  }

  private boolean isExitCode(String input) {
    return input.equalsIgnoreCase(EXIT_CODE);
  }

  private void closeConnection() {
    try {
      socketOut.close();
      socketIn.close();
      userIn.close();
      socket.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String args[]) {
    new Client(HOST, PORT);
  }
}
