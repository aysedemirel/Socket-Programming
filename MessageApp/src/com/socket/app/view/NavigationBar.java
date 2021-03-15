package com.socket.app.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;


public class NavigationBar extends JPanel {

  private static final long serialVersionUID = 1L;
  private static final int BUTTON_HEIGHT = 200;
  private static final int BUTTON_WIDTH = 270;

  private JButton messageButton;
  private JButton settingButton;
  private JButton exportImportButton;
  private JButton helpButton;

  public NavigationBar() {
    super(new MigLayout("fillx"));
    setVisible(true);
    setBackground(Color.GRAY);
    setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
    add(getMessageButton());
    add(getSettingButton());
    add(getExportImportButton());
    add(getHelpButton());
  }

  private JButton getMessageButton() {
    if (messageButton == null) {
      messageButton = new JButton("MESSAGE");
      messageButton.setBackground(Color.GRAY);
      messageButton.setForeground(Color.WHITE);
      messageButton.setSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      messageButton.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    return messageButton;
  }

  private JButton getSettingButton() {
    if (settingButton == null) {
      settingButton = new JButton("SETTING");
      settingButton.setBackground(Color.GRAY);
      settingButton.setForeground(Color.WHITE);
      settingButton.setSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      settingButton.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    return settingButton;
  }

  private JButton getExportImportButton() {
    if (exportImportButton == null) {
      exportImportButton = new JButton("EXPORT/IMPORT");
      exportImportButton.setBackground(Color.GRAY);
      exportImportButton.setForeground(Color.WHITE);
      exportImportButton.setSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      exportImportButton.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    return exportImportButton;
  }

  private JButton getHelpButton() {
    if (helpButton == null) {
      helpButton = new JButton("HELP");
      helpButton.setBackground(Color.GRAY);
      helpButton.setForeground(Color.WHITE);
      helpButton.setSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      helpButton.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    return helpButton;
  }

  // private String getHtml() {
  // return "<html>Uncolored Text! <font color=purple><selection color=white>Testing if some html
  // can turn the selection color white!</selection></font> more Uncolored Text!</html>";
  // }
}
