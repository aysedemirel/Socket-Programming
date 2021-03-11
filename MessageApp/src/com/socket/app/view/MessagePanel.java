package com.socket.app.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class MessagePanel extends JPanel {

  private static final long serialVersionUID = 1L;

  public MessagePanel() {
    super(new MigLayout("fillx"));
    add(new JLabel("Very long label:"), "");
    add(new JTextField(20), "wrap");
    add(new JLabel("Short 1:"), "right");
    add(new JTextField(20));
    add(new JLabel("Short 2:"), "right");
    add(new JTextField(10), "wrap");

  }

}
