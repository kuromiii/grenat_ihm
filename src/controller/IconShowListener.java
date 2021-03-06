package controller;

import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import view.*;

public class IconShowListener implements ActionListener {
    // The image so show or hide
    private JLabel img;

    /**
     * IconShowListener constructor
     * Checks if given parameters are valid, and throws an exception otherwise.
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
     * Shows or hides an image when the button is clicked
     * @param e the action event
     */
    public void actionPerformed (ActionEvent e) {
      if (((JButton)e.getSource()).getText().equalsIgnoreCase("Cacher batterie")) {
        this.img.setVisible(false);
        ((JButton)e.getSource()).setText("Afficher batterie");
      }
      else if (((JButton)e.getSource()).getText().equalsIgnoreCase("Cacher wifi")) {
        this.img.setVisible(false);
        ((JButton)e.getSource()).setText("Afficher wifi");
      }
      else if (((JButton)e.getSource()).getText().equalsIgnoreCase("Afficher wifi")) {
        this.img.setVisible(true);
        ((JButton)e.getSource()).setText("Cacher wifi");
      }
      else if (((JButton)e.getSource()).getText().equalsIgnoreCase("Afficher batterie")) {
        this.img.setVisible(true);
        ((JButton)e.getSource()).setText("Cacher batterie");
      }
    }
}
