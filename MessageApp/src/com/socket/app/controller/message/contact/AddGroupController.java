package com.socket.app.controller.message.contact;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.socket.app.view.message.contact.extra.AddGroupPanel;

public class AddGroupController {
  private AddGroupPanel panel;

  public AddGroupController(AddGroupPanel panel) {
    this.panel = panel;
    addListenerToButtons();
  }

  private void addListenerToButtons() {
    panel.getButtonPanel().getOkButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String nameText = panel.getGroupNameArea().getText();
        if (panel.getContactListPanel().isCheckEmpty()) {
          System.out.println("Please choose some contacts...");
        } else if (nameText.equals("")) {
          System.out.println("Please fill the group area correctly...");
        } else {
          // TODO: add group to database
          panel.setVisible(false);
        }
      }
    });
    panel.getButtonPanel().getCancelButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        panel.setVisible(false);
      }
    });
  }
}
