package com.socket.app.view.message.contact.extra;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import com.socket.app.controller.message.contact.AddGroupController;
import net.miginfocom.swing.MigLayout;

public class AddGroupPanel extends JDialog {
  private static final long serialVersionUID = 1L;
  private JTextArea groupNameArea;
  private ContactListPanel contactListPanel;
  private ButtonPanel buttonPanel;

  public AddGroupPanel() {
    getContentPane().setLayout(new MigLayout("", "[grow][grow]", "[grow][grow][grow][grow]"));
    getContentPane().add(new JLabel("Group Name: "), "cell 0 0");
    getContentPane().add(getGroupNameArea(), "cell 1 0");
    getContentPane().add(getContactListPanel(), "cell 0 2 2 1");
    getContentPane().add(getButtonPanel(), "cell 0 3 2 1");

    setSize(300, 200);
    setTitle("Add Group");
    new AddGroupController(this);
  }

  public JTextArea getGroupNameArea() {
    if (groupNameArea == null) {
      groupNameArea = new JTextArea(1, 20);
    }
    return groupNameArea;
  }

  public ContactListPanel getContactListPanel() {
    if (contactListPanel == null) {
      contactListPanel = new ContactListPanel();
    }
    return contactListPanel;
  }

  public ButtonPanel getButtonPanel() {
    if (buttonPanel == null) {
      buttonPanel = new ButtonPanel();
    }
    return buttonPanel;
  }
}
