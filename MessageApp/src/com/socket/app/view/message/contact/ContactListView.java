package com.socket.app.view.message.contact;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class ContactListView extends JPanel {

  private static final long serialVersionUID = 1L;

  private List<ContactListItem> contactList;

  public ContactListView() {
    super(new MigLayout("", "[grow]"));
    contactList = new ArrayList<ContactListItem>();
    contactList.add(new ContactListItem());
    setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
    add(new ContactTopButonPanel(), "wrap, grow");
    addContactItems();
  }

  private void addContactItems() {
    for (ContactListItem contactListItem : contactList) {
      add(contactListItem, "wrap, grow");
    }
  }

  public void addContactListItem(ContactListItem item) {
    contactList.add(item);
    add(item);
  }

  public void removeContactListItem(ContactListItem item) {
    remove(contactList.get(contactList.indexOf(item)));
    contactList.remove(item);
  }

}
