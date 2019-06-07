package controller;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import view.*;

public class CheckboxListener implements ItemListener {
  // An ArrayList containing the Checkboxes
  private ArrayList<Checkbox> list;
  private MainFrame mainFrame;

  /**
   * CheckboxListener constructor.
   * Checks if the given ArrayList list is valid, throws an error otherwise.
   * @param list the ArrayList containing checkboxes
   */
  public CheckboxListener(ArrayList<Checkbox> list) {
    if (list != null) {
      this.list = list;
    } else {
      throw new NullPointerException();
    }
  }

  /**
    * CheckboxListener constructor for the last Checkbox of the JPanel
    * @param list the ArrayList containing checkboxes
    * @param mainFrame the main frame of the application
    */
  public CheckboxListener(ArrayList<Checkbox> list , MainFrame mainFrame) {
    if (list != null && mainFrame != null) {
      this.list = list;
      this.mainFrame = mainFrame;
    }
    else {
      throw new NullPointerException();
    }
  }

  /**
   * Whenever a Checkbox gets checked, show the next one.
   * @param e the event
   */
  public void itemStateChanged(ItemEvent e) {
    Checkbox self = ((Checkbox)e.getSource());

    self.setEnabled(false);
    self.setForeground(Color.GREEN);

    int cursor = this.list.indexOf(self) + 1;
    if (cursor < this.list.size()) {
      this.list.get(cursor).setVisible(true);
    }
    else {
      try {
        mainFrame.victory();
      }
      catch (NullPointerException ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
}
