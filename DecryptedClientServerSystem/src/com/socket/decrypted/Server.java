package com.socket.decrypted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server receives encrypted messages from client, decrypted the messages <br>
 * and sends the decrypted version of the messages as response <br>
 * 
 * q is an exit keyword, it will close the connection
 * 
 * Decrypting method: Caesar cipher
 * 
 * @author aysedemirel
 */
public class Server {
  public static final int PORT_NUMBER = 8081;
  private static final String EXIT_CODE = "q";
  private static final char END_LINE = '\0';
  private static final char NEW_LINE = '\n';
  private static final int A_ASCII = 65;
  private static final int Z_ASCII = 90;
  private static final int a_ASCII = 97;
  private static final int z_ASCII = 122;
  private static final int BRACKET_ASCII = 91;
  private static final int SPACE_ASCII = 32;
  private static final int CHARACTER_NUMBER = 26;
  private static final int DECRYPTED_KEY = 3;

  private Socket socket = null;
  private ServerSocket server = null;
  private InputStream in = null;
  private OutputStream out = null;
  private BufferedReader bufferReader = null;

  private Server() {
    initServerSocket();
    System.out.println(
        "New client connected from ".toUpperCase() + socket.getInetAddress().getHostAddress());
    startCommunication();
  }

  private void initServerSocket() {
    try {
      server = new ServerSocket(PORT_NUMBER);
      socket = server.accept();
    } catch (IOException ex) {
      System.err.println("Unable to start server.");
    } finally {
      closeServerSocket();
    }
  }

  private void closeServerSocket() {
    try {
      if (server != null) {
        server.close();
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public void startCommunication() {

    new Thread(new Runnable() {
      @Override
      public void run() {
        initConnection();
        try {
          String hiddenInput;
          while ((hiddenInput = bufferReader.readLine()) != null) {
            System.out.println("SERVER-DATA: " + hiddenInput);
            char[] hidden = hiddenInput.toCharArray();
            int index = 0;
            char controlChar = hidden[index];
            if (hiddenInput.equalsIgnoreCase(EXIT_CODE)) {
              System.exit(0);
              break;
            }
            while (controlChar != END_LINE) {
              if (isUpperAZ(controlChar)) {
                hidden[index] = upperAzOperation(hidden[index]);
              }
              if (isUnderUpperA(hidden[index])) {
                hidden[index] = (char) (hidden[index] + CHARACTER_NUMBER);
              }
              if (isLowerAZ(controlChar)) {
                hidden[index] = lowerAzOperation(hidden[index]);
              }
              if (isNotLetter(hidden[index])) {
                // a-z out of a-z,add 26(number of the a-z group) to return the a-z
                hidden[index] = (char) (hidden[index] + CHARACTER_NUMBER);
              }
              if (isSpaceChar(controlChar)) {
                hidden[index] = controlChar;
              }
              index++;
              if (index < hidden.length) {
                controlChar = hidden[index];
              } else {
                break;
              }
            }
            hiddenInput = String.valueOf(hidden);
            System.out.println("server-decrypted data: ".toUpperCase() + hiddenInput);
            hiddenInput += NEW_LINE;
            out.write(hiddenInput.getBytes());
          }
        } catch (IOException ex) {
          System.err.println("Unable to write to out stream");
        } finally {
          closeConnection();
        }
      }
    }).start();;
  }

  private void initConnection() {
    try {
      in = socket.getInputStream();
      out = socket.getOutputStream();
      bufferReader = new BufferedReader(new InputStreamReader(in));
    } catch (IOException e) {
      System.err.println("Unable to get streams from client");
    }
  }

  /** @param [A-Z] */
  private char upperAzOperation(char operationChar) {
    char result = (char) (operationChar - DECRYPTED_KEY);
    if (isOverUpperZ(result)) {
      result = (char) ((result % Z_ASCII) + A_ASCII);
    }
    return result;
  }

  /** @param [a-z] */
  private char lowerAzOperation(char operationChar) {
    char result = (char) (operationChar - DECRYPTED_KEY);
    if (isOverLowerZ(result)) {
      /**
       * If result is over z(for example "{"-->123), it is not letter so convert it <br>
       * 123%122=1 1+97=98-->b
       */
      result = (char) ((result % z_ASCII) + a_ASCII);
    }
    return result;
  }

  private boolean isUpperAZ(char ch) {
    return ch >= A_ASCII && ch <= Z_ASCII;
  }

  private boolean isLowerAZ(char ch) {
    return ch >= a_ASCII && ch <= z_ASCII;
  }

  private boolean isNotLetter(char ch) {
    return ch < a_ASCII && ch >= BRACKET_ASCII;
  }

  private boolean isSpaceChar(char ch) {
    return ch == SPACE_ASCII;
  }

  private boolean isOverLowerZ(char ch) {
    return ch > z_ASCII;
  }

  private boolean isOverUpperZ(char ch) {
    return ch > Z_ASCII;
  }

  private boolean isUnderUpperA(char ch) {
    return ch < A_ASCII;
  }

  private void closeConnection() {
    try {
      in.close();
      out.close();
      socket.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new Server();
  }
}
