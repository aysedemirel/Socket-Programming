package com.socket.app.view.message.conversation;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class ConversationPanel extends JPanel {

  private static final long serialVersionUID = 1L;

  public ConversationPanel() {
    super(new MigLayout("fillx"));
    setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));

    setSize(new Dimension(680, 680));
    add(new JLabel("Temp:"), "");
    add(new JTextField(20), "wrap");
    add(new JLabel("Temp 1:"), "right");
    add(new JTextField(20));
    add(new JLabel("Temp 2:"), "right");
    add(new JTextField(10), "wrap");

  }

}
