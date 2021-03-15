package com.socket.app.view.message.contact;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class ContactListItem extends JPanel {

  private static final long serialVersionUID = 1L;

  private JLabel icon;
  private JPanel msgArea;
  private JLabel name;
  private JLabel summary;

  public ContactListItem() {
    super(new MigLayout("fillx"));
    setVisible(true);
    add(getIcon(), "dock west");
    add(getMessageArea(), "dock north");
    setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
  }

  private JLabel getIcon() {
    if (icon == null) {
      icon = new JLabel("ICON");
      icon.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
    }
    return icon;
  }

  private JPanel getMessageArea() {
    if (msgArea == null) {
      msgArea = new JPanel();
      msgArea.setVisible(true);
      msgArea.setBackground(Color.WHITE);
      msgArea.setLayout(new MigLayout("filly"));
      msgArea.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
      msgArea.add(getNameArea(), "wrap");
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
      summary.setForeground(Color.GRAY);
    }
    return summary;
  }
}
