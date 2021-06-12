package com.socket.app.view.message.contact;

import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.text.MaskFormatter;
import com.socket.app.controller.message.contact.AddContactController;
import net.miginfocom.swing.MigLayout;

public class AddContactPanel extends JDialog {
  private static final long serialVersionUID = 1L;

  private JTextArea nameArea;
  private JFormattedTextField ipArea;
  private JButton okButton;
  private JButton cancelButton;

  public AddContactPanel() {
    setLayout(new MigLayout("", "[grow][grow]", "[grow][grow]"));
    add(new JLabel("Contact Name: "));
    add(getNameArea(), "wrap");
    add(new JLabel("Contact IP Adress: "));
    add(getIpArea(), "wrap");
    add(getOkButton());
    add(getCancelButton());
    setSize(300, 200);
    setTitle("Add Contact");
    new AddContactController(this);
  }

  public JTextArea getNameArea() {
    if (nameArea == null) {
      nameArea = new JTextArea(1, 20);
    }
    return nameArea;
  }

  public JFormattedTextField getIpArea() {
    if (ipArea == null) {

      ipArea = new JFormattedTextField(getIpFormat());
      ipArea.setColumns(20);
    }
    return ipArea;
  }

  private MaskFormatter getIpFormat() {
    try {
      MaskFormatter mf = new MaskFormatter("###.###.###.###");
      return mf;
    } catch (ParseException e) {
      e.printStackTrace();
      return new MaskFormatter();
    }
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
