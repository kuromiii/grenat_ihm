package controller;

import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import view.*;

public class AppearanceListener implements ActionListener {

  private TopBar topBar;
  private Color color;

  /**
    * AppearanceListener constructor
    * Checks if given parameters are valid, and throws an exception otherwise.
    * @param topBar the topBar used in the application
    * @param color the color that will be given to the topBar when a Button gets clicked
    */
    public AppearanceListener (TopBar topBar , Color color) {
      if (topBar != null && color != null) {
        this.topBar = topBar;
        this.color = color;
      }
      else {
        throw new NullPointerException();
      }
    }

  /**
    * Change the color of the TopBar when a button is clicked
    * @param e the event
    */
    public void actionPerformed (ActionEvent e) {
        this.topBar.setColor(this.color);
    }
}
