package com.socket.app.view.message.contact;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import com.socket.app.ImageUtil;
import com.socket.app.controller.message.contact.ContactTopButtonController;
import net.miginfocom.swing.MigLayout;

public class ContactTopButonPanel extends JPanel {
  private static final long serialVersionUID = 1L;
  private static final Color BACKGROUND_COLOR = Color.GRAY.brighter().brighter();
  private JButton addContactBtn;
  private JButton addGroupBtn;
  private JButton addLayerBtn;
  private JButton addLocationBtn;
  private JButton translateBtn;
  private JButton hideBtn;
  private JButton addAlarmBtn;
  private JButton deleteBtn;

  public ContactTopButonPanel() {
    super(new MigLayout());
    setBackground(BACKGROUND_COLOR);
    setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
    add(getAddContactBtn());
    add(getAddGroupBtn());
    add(getAddLayerBtn());
    add(getAddLocationBtn());
    add(getTranslateBtn());
    add(getHideBtn());
    add(getAddAlarmBtn());
    add(getDeleteBtn());
    new ContactTopButtonController(this);
  }

  public JButton getAddContactBtn() {
    if (addContactBtn == null) {
      addContactBtn = new JButton(ImageUtil.ADD_CONTACT_ICON);
      addContactBtn.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      addContactBtn.setBackground(BACKGROUND_COLOR);
    }
    return addContactBtn;
  }

  public JButton getAddGroupBtn() {
    if (addGroupBtn == null) {
      addGroupBtn = new JButton(ImageUtil.ADD_GROUP_ICON);
      addGroupBtn.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      addGroupBtn.setBackground(BACKGROUND_COLOR);
    }
    return addGroupBtn;
  }

  public JButton getAddLayerBtn() {
    if (addLayerBtn == null) {
      addLayerBtn = new JButton(ImageUtil.ADD_LAYER_ICON);
      addLayerBtn.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      addLayerBtn.setBackground(BACKGROUND_COLOR);
    }
    return addLayerBtn;
  }

  public JButton getAddLocationBtn() {
    if (addLocationBtn == null) {
      addLocationBtn = new JButton(ImageUtil.ADD_LOCATION_ICON);
      addLocationBtn.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      addLocationBtn.setBackground(BACKGROUND_COLOR);
    }
    return addLocationBtn;
  }

  public JButton getTranslateBtn() {
    if (translateBtn == null) {
      translateBtn = new JButton(ImageUtil.TRANSLATE_ICON);
      translateBtn.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      translateBtn.setBackground(BACKGROUND_COLOR);
    }
    return translateBtn;
  }

  public JButton getHideBtn() {
    if (hideBtn == null) {
      hideBtn = new JButton(ImageUtil.HIDE_ICON);
      hideBtn.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      hideBtn.setBackground(BACKGROUND_COLOR);
    }
    return hideBtn;
  }

  public JButton getAddAlarmBtn() {
    if (addAlarmBtn == null) {
      addAlarmBtn = new JButton(ImageUtil.ADD_ALARM_ICON);
      addAlarmBtn.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      addAlarmBtn.setBackground(BACKGROUND_COLOR);
    }
    return addAlarmBtn;
  }

  public JButton getDeleteBtn() {
    if (deleteBtn == null) {
      deleteBtn = new JButton(ImageUtil.DELETE_ICON);
      deleteBtn.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      deleteBtn.setBackground(BACKGROUND_COLOR);
    }
    return deleteBtn;
  }
}
