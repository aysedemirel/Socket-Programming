package com.socket.app.view;

import java.awt.Dimension;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

  private static final long serialVersionUID = 1L;

  private NavigationBar navigationBar;
  private ContactListView contactListView;
  private MessagePanel messagePanel;

  public MainFrame() {

    setSize(new Dimension(1080, 1080));
    add(getNavigationBar());
    // add(getContactListView());
    add(getMessagePanel());
  }

  private NavigationBar getNavigationBar() {
    if (navigationBar == null) {
      navigationBar = new NavigationBar();
    }
    return navigationBar;
  }

  private ContactListView getContactListView() {
    if (contactListView == null) {
      contactListView = new ContactListView();
    }
    return contactListView;
  }

  private MessagePanel getMessagePanel() {
    if (messagePanel == null) {
      messagePanel = new MessagePanel();
    }
    return messagePanel;
  }
}
