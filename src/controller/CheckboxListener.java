package controller;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import view.*;

public class CheckboxListener implements ItemListener {
  // An ArrayList containing the Checkboxes
  private ArrayList<Checkbox> list;

  public CheckboxListener(ArrayList<Checkbox> list) {
    if (list != null) {
      this.list = list;
    } else {
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
  }
}
