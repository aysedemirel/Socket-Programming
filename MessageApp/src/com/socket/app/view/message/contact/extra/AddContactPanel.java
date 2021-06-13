package com.socket.app.view.message.contact.extra;

import java.text.ParseException;
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
  private ButtonPanel butonPanel;

  public AddContactPanel() {
    getContentPane().setLayout(new MigLayout("", "[grow][grow]", "[grow][grow][]"));
    getContentPane().add(new JLabel("Contact Name: "), "cell 0 0");
    getContentPane().add(getNameArea(), "cell 1 0");
    getContentPane().add(new JLabel("Contact IP Adress: "), "cell 0 1");
    getContentPane().add(getIpArea(), "cell 1 1");
    getContentPane().add(getButtonPanel(), "cell 0 2 2 1");
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

  public ButtonPanel getButtonPanel() {
    if (butonPanel == null) {
      butonPanel = new ButtonPanel();
    }
    return butonPanel;
  }

}
