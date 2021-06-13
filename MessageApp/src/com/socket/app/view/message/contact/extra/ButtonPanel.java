package com.socket.app.view.message.contact.extra;

import javax.swing.JButton;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class ButtonPanel extends JPanel {
  private static final long serialVersionUID = 1L;

  private JButton okButton;
  private JButton cancelButton;

  public ButtonPanel() {
    setLayout(new MigLayout("", "[grow][grow]", "[grow]"));
    add(getOkButton(), "alignx center");
    add(getCancelButton(), "alignx center");
  }

  public JButton getOkButton() {
    if (okButton == null) {
      okButton = new JButton("OK");
    }
    return okButton;
  }

  public JButton getCancelButton() {
    if (cancelButton == null) {
      cancelButton = new JButton("Cancel");
    }
    return cancelButton;
  }
}
