package com.socket.app.view.message.contact.extra;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class ContactListPanel extends JPanel {
  private static final long serialVersionUID = 1L;

  public ContactListPanel() {
    setLayout(new MigLayout("", "[grow]", ""));
    setBorder(BorderFactory.createTitledBorder("Choose Contacts"));
    setMinimumSize(new Dimension(260, 10));
    addContacts();
  }

  private void addContacts() {
    ArrayList<String> contacts = new ArrayList<>();
    // TODO: pull contact list form database
    contacts.add("TEMP");

    for (String contact : contacts) {
      add(new JCheckBox(contact), "wrap");
    }
  }

  public boolean isCheckEmpty() {
    return true;
  }


}
