package com.socket.app.view.contact;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContactListItem extends JPanel {

  private static final long serialVersionUID = 1L;

  private JLabel icon;
  private JPanel msgArea;
  private JLabel name;
  private JLabel summary;

  public ContactListItem() {
    setVisible(true);
    setBackground(Color.GRAY);
    setSize(new Dimension(400, 400));
    add(getIcon());
    add(getMessageArea());
  }

  private JLabel getIcon() {
    if (icon == null) {
      icon = new JLabel("ICON");
    }
    return icon;
  }

  private JPanel getMessageArea() {
    if (msgArea == null) {
      msgArea = new JPanel();
      msgArea.setVisible(true);
      msgArea.setBackground(Color.WHITE);
      msgArea.setSize(new Dimension(100, 70));
      msgArea.add(getNameArea());
      msgArea.add(getSummaryArea());
    }
    return msgArea;
  }

  private JLabel getNameArea() {
    if (name == null) {
      name = new JLabel("Name");
    }
    return name;
  }

  private JLabel getSummaryArea() {
    if (summary == null) {
      summary = new JLabel("Summary");
    }
    return summary;
  }
}
