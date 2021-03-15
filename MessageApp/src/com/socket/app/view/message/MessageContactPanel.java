package com.socket.app.view.message;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import com.socket.app.view.message.contact.ContactListView;
import com.socket.app.view.message.conversation.ConversationPanel;
import net.miginfocom.swing.MigLayout;

public class MessageContactPanel extends JPanel {
  private static final long serialVersionUID = 1L;

  private JSplitPane messageContactPane;
  private ContactListView contactListView;
  private ConversationPanel conversationPanel;

  public MessageContactPanel() {
    super(new MigLayout("filly"));
    setSize(new Dimension(1080, 680));
    add(getMessageContactPane(), "dock east");
  }

  private JSplitPane getMessageContactPane() {
    if (messageContactPane == null) {
      messageContactPane =
          new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, getContactListView(), getConversationPanel());
      messageContactPane.setSize(new Dimension(400, 680));
    }
    return messageContactPane;
  }

  private ContactListView getContactListView() {
    if (contactListView == null) {
      contactListView = new ContactListView();
    }
    return contactListView;
  }

  private ConversationPanel getConversationPanel() {
    if (conversationPanel == null) {
      conversationPanel = new ConversationPanel();
    }
    return conversationPanel;
  }
}
