package com.socket.app.view.message.contact;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.socket.app.ImageUtil;
import net.miginfocom.swing.MigLayout;

public class ContactListItem extends JPanel {

  private static final long serialVersionUID = 1L;

  private JLabel icon;
  private JPanel msgArea;
  private JLabel name;
  private JLabel summary;

  public ContactListItem() {
    super(new MigLayout("", "[grow][grow]", "[grow]"));
    setVisible(true);
    add(getIcon());
    add(getMessageArea());
    setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
  }

  private JLabel getIcon() {
    if (icon == null) {
      icon = new JLabel(ImageUtil.EMOJI_ICON);
      icon.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
    }
    return icon;
  }

  private JPanel getMessageArea() {
    if (msgArea == null) {
      msgArea = new JPanel();
      msgArea.setVisible(true);
      msgArea.setBackground(Color.WHITE);
      msgArea.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
      msgArea.setLayout(new MigLayout("", "[grow]", "[grow][grow]"));
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
