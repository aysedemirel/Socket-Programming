package com.socket.app;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageUtil {
  // LIST NAVIGATOR SET
  public static final ImageIcon ADD_CONTACT_ICON =
      scaleImage(new ImageIcon(".\\img\\list\\add-user.png"), 25, 25);
  public static final ImageIcon ADD_GROUP_ICON =
      scaleImage(new ImageIcon(".\\img\\list\\add-group.png"), 35, 35);
  public static final ImageIcon ADD_LAYER_ICON =
      scaleImage(new ImageIcon(".\\img\\list\\add-layer.png"), 25, 25);
  public static final ImageIcon ADD_LOCATION_ICON =
      scaleImage(new ImageIcon(".\\img\\list\\add-location.png"), 25, 25);
  public static final ImageIcon ADD_ALARM_ICON =
      scaleImage(new ImageIcon(".\\img\\list\\add-alarm.png"), 25, 25);
  public static final ImageIcon DELETE_ICON =
      scaleImage(new ImageIcon(".\\img\\list\\delete.png"), 25, 25);
  public static final ImageIcon HIDE_ICON =
      scaleImage(new ImageIcon(".\\img\\list\\hide.png"), 25, 25);
  public static final ImageIcon TRANSLATE_ICON =
      scaleImage(new ImageIcon(".\\img\\list\\translate.png"), 25, 25);

  // MESSAGE ICON SET
  public static final ImageIcon ATTACHMENT_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\attachment.png"), 25, 25);
  public static final ImageIcon CALENDER_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\calender.png"), 25, 25);
  public static final ImageIcon COPY_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\copy.png"), 25, 25);
  public static final ImageIcon CUT_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\cut.png"), 25, 25);
  public static final ImageIcon DISLIKE_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\dislike.png"), 25, 25);
  public static final ImageIcon EMAIL_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\email.png"), 25, 25);
  public static final ImageIcon EMOJI_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\emoji.png"), 25, 25);
  public static final ImageIcon FAVOURITE_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\favourite.png"), 25, 25);
  public static final ImageIcon LABEL_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\label.png"), 25, 25);
  public static final ImageIcon LINE_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\line.png"), 25, 25);
  public static final ImageIcon MICROPHONE_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\microphone.png"), 25, 25);
  public static final ImageIcon MORE_HORIZONTAL_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\more-horizontal.png"), 25, 25);
  public static final ImageIcon MORE_VERTICAL_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\more-vertical.png"), 25, 25);
  public static final ImageIcon PHOTO_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\photo.png"), 25, 25);
  public static final ImageIcon READ_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\read.png"), 25, 25);
  public static final ImageIcon RECEIVE_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\receive.png"), 25, 25);
  public static final ImageIcon RIGHT_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\right.png"), 25, 25);
  public static final ImageIcon SEARCH_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\search.png"), 25, 25);
  public static final ImageIcon SEND_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\send.png"), 25, 25);
  public static final ImageIcon SETTING_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\setting.png"), 25, 25);
  public static final ImageIcon SHARE_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\share.png"), 25, 25);
  public static final ImageIcon UP_ICON =
      scaleImage(new ImageIcon(".\\img\\message\\up.png"), 25, 25);


  public static ImageIcon scaleImage(ImageIcon image, int width, int height) {
    Image scaled = image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    return new ImageIcon(scaled);
  }

}
