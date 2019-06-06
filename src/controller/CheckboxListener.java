package controller;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import view.*;

public class CheckboxListener implements ActionListener {

  private ArrayList<Checkbox> list;

  public CheckboxListener (ArrayList<Checkbox> list) {
    try {
      if (list == null) {
        throw new Exception("Erreur du constructeur CheckboxListener(), parametre null");
      }
      this.list = list;
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void actionPerformed (ActionEvent e) {
    Checkbox self = ((Checkbox)e.getSource());
    self.setEnabled(false);
    self.setForeground(Color.GREEN);
    int cursor = this.list.indexOf(self) + 1;
    if (cursor < this.list.size()) {
      this.list.get(cursor).setVisible(true);
    }
    else {
    }
  }
}
