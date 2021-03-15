package com.socket.app;

import javax.swing.JFrame;
import com.socket.app.view.MainFrame;

public class Main {
  public static void main(String[] args) {
    MainFrame mainFrame = new MainFrame();
    mainFrame.setVisible(true);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  // public static void main(String[] args) {
  // JFrame frame = new JFrame();
  //
  // // create radio buttons
  // JRadioButton radio1 = new JRadioButton("1");
  // JRadioButton radio2 = new JRadioButton("2");
  // JRadioButton radio3 = new JRadioButton("3");
  // JRadioButton radio4 = new JRadioButton("4");
  //
  // // create buttons
  // JButton buttonA = new JButton("A");
  // JButton buttonB = new JButton("B");
  // JButton buttonC = new JButton("C");
  // JButton buttonD = new JButton("D");
  // JButton buttonE = new JButton("=");
  //
  // // create the panel that contains the radio buttons
  // JPanel radioPanel = new JPanel(new MigLayout("wrap 1")); // wrap 1 let's us avoid adding the
  // // wrap constraing to every component
  // radioPanel.add(radio1);
  // radioPanel.add(radio2);
  // radioPanel.add(radio3);
  // radioPanel.add(radio4);
  //
  // // create the panel that contains the other buttons
  // JPanel buttonPanel = new JPanel(new MigLayout("filly, wrap 2")); // filly tells it to take up
  // // all the vertical space
  // // add growy to all components so they will fit the cell height
  // buttonPanel.add(buttonA, "growy");
  // buttonPanel.add(buttonD, "growy");
  // buttonPanel.add(buttonB, "growy");
  // buttonPanel.add(buttonE, "span 1 2, growy"); // span 1 2 tells this component to span 1 column
  // // and 2 rows
  // buttonPanel.add(buttonC, "growy");
  //
  // // create the main contentPane
  // JPanel contentPane = new JPanel(new MigLayout("filly")); // again, we want to fill the vertical
  // // space so the 2 panels will have the
  // // same height
  // contentPane.add(radioPanel);
  // contentPane.add(buttonPanel, "growy");
  //
  // frame.setContentPane(contentPane);
  // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  // frame.pack();
  // frame.setVisible(true);
  // }
}
