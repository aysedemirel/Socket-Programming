package com.socket.app.view.message.contact;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ContactListView extends JPanel {

  private static final long serialVersionUID = 1L;

  private ContactListItem contactListItem;

  public ContactListView() {
    setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
    setSize(new Dimension(200, 100));
    add(getContactItem());
  }

  private ContactListItem getContactItem() {
    contactListItem = new ContactListItem();
    return contactListItem;
  }
}
