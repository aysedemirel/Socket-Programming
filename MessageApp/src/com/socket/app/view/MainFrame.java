package com.socket.app.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import com.socket.app.view.message.MessageContactPanel;
import net.miginfocom.swing.MigLayout;

public class MainFrame extends JFrame {

  private static final long serialVersionUID = 1L;

  private NavigationBar navigationBar;
  private MessageContactPanel messageContactPanel;

  public MainFrame() {
    setLayout(new MigLayout("filly"));
    setSize(new Dimension(800, 900));
    add(getNavigationBar(), "dock north");
    add(getMessageContactPanel(), "dock east");
  }

  private NavigationBar getNavigationBar() {
    if (navigationBar == null) {
      navigationBar = new NavigationBar();
    }
    return navigationBar;
  }

  private MessageContactPanel getMessageContactPanel() {
    if (messageContactPanel == null) {
      messageContactPanel = new MessageContactPanel();
    }
    return messageContactPanel;
  }


}
