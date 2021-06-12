package com.socket.app.controller.message.contact;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.socket.app.view.message.contact.AddContactPanel;
import com.socket.app.view.message.contact.ContactTopButonPanel;

public class ContactTopButtonController {

  private ContactTopButonPanel panel;
  private AddContactPanel addContactPanel;

  public ContactTopButtonController(ContactTopButonPanel panel) {
    this.panel = panel;
    addListeners();
  }

  public void addListeners() {
    panel.getAddContactBtn().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.out.println("Click add user");
        getAddContactPanel().setVisible(true);
      }
    });
    panel.getAddGroupBtn().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
      }
    });
    panel.getAddLayerBtn().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
      }
    });
    panel.getAddLocationBtn().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
      }
    });
    panel.getTranslateBtn().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
      }
    });
    panel.getHideBtn().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
      }
    });
    panel.getAddAlarmBtn().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
      }
    });
    panel.getDeleteBtn().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
      }
    });
  }

  private AddContactPanel getAddContactPanel() {
    if (addContactPanel == null) {
      addContactPanel = new AddContactPanel();
    }
    return addContactPanel;
  }
}
