package com.socket.app.controller.message.contact;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.socket.app.view.message.contact.AddContactPanel;

public class AddContactController {
  private static final String IP_REGEX = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
  private AddContactPanel panel;

  public AddContactController(AddContactPanel panel) {
    this.panel = panel;
    addListenerToButtons();
  }


  private void addListenerToButtons() {
    panel.getOkButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String nameText = panel.getNameArea().getText();
        if (!isIpCorrect()) {
          System.out.println("Please fill the ip correctly...");
        } else if (nameText.equals("")) {
          System.out.println("Please fill the name area correctly...");
        } else {
          // TODO: add contact to database
        }
        panel.setVisible(false);
      }
    });
    panel.getCancelButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        panel.setVisible(false);
      }
    });
  }

  private boolean isIpCorrect() {
    String ip = panel.getIpArea().getText();
    System.out.println("IP: " + ip);
    return ip.matches(IP_REGEX) || ip.equals("   .   .   .   ");
  }

}
