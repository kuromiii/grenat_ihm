package controller;

import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import view.*;

public class IconShowListener implements ActionListener {

  private JLabel img;

  /**
    * IconShowListener constructor
    * @param img the label containing the image to show or to hide
    */
    public IconShowListener (JLabel img) {
      if (img != null) {
        this.img = img;
      }
      else {
        throw new NullPointerException();
      }
    }

  /**
    * Hide or show an image when the button is clicked
    * @param e the event
    */
    public void actionPerformed (ActionEvent e) {
      if (((JButton)e.getSource()).getText().equalsIgnoreCase("Hide battery use")) {
        this.img.setVisible(false);
        ((JButton)e.getSource()).setText("Show battery use");
      }
      else if (((JButton)e.getSource()).getText().equalsIgnoreCase("Hide wifi")) {
        this.img.setVisible(false);
        ((JButton)e.getSource()).setText("Show wifi");
      }
      else if (((JButton)e.getSource()).getText().equalsIgnoreCase("Show wifi")) {
        this.img.setVisible(true);
        ((JButton)e.getSource()).setText("Hide wifi");
      }
      else if (((JButton)e.getSource()).getText().equalsIgnoreCase("Hide battery use")) {
        this.img.setVisible(true);
        ((JButton)e.getSource()).setText("Hide battery use");
      }
    }
}