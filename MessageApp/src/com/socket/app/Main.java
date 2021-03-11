package com.socket.app;

import javax.swing.JFrame;
import com.socket.app.view.MainFrame;

public class Main {
  public static void main(String[] args) {
    MainFrame mainFrame = new MainFrame();
    mainFrame.setVisible(true);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
