package com.socket.app.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class NavigationBar extends JPanel {

  private static final long serialVersionUID = 1L;

  private JButton messageButton;
  private JButton settingButton;
  private JButton exportImportButton;
  private JButton helpButton;

  public NavigationBar() {
    super(new MigLayout("fillx"));
    setVisible(true);
    setBackground(Color.GRAY);
    setSize(new Dimension(600, 200));
    add(getMessageButton());
    add(getSettingButton());
    add(getExportImportButton());
    add(getHelpButton());
  }

  private JButton getMessageButton() {
    if (messageButton == null) {
      messageButton = new JButton("MESSAGE");
      messageButton.setBackground(Color.GRAY.darker());
      messageButton.setSize(new Dimension(200, 200));
      messageButton.setBorder(null);
    }
    return messageButton;
  }

  private JButton getSettingButton() {
    if (settingButton == null) {
      settingButton = new JButton("SETTING");
      settingButton.setBackground(Color.GRAY.darker());
      settingButton.setSize(new Dimension(200, 200));
      settingButton.setBorder(null);
    }
    return settingButton;
  }

  private JButton getExportImportButton() {
    if (exportImportButton == null) {
      exportImportButton = new JButton("EXPORT/IMPORT");
      exportImportButton.setBackground(Color.GRAY.darker());
      exportImportButton.setSize(new Dimension(200, 200));
      exportImportButton.setBorder(null);
    }
    return exportImportButton;
  }

  private JButton getHelpButton() {
    if (helpButton == null) {
      helpButton = new JButton("HELP");
      helpButton.setBackground(Color.GRAY.darker());
      helpButton.setSize(new Dimension(200, 200));
      helpButton.setBorder(null);
    }
    return helpButton;
  }

  // private String getHtml() {
  // return "<html>Uncolored Text! <font color=purple><selection color=white>Testing if some html
  // can turn the selection color white!</selection></font> more Uncolored Text!</html>";
  // }
}
