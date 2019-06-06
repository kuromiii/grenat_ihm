package controller;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import view.*;

public class CheckboxListener implements ActionListener {

  private ArrayList<Checkbox> list;
  private int cursor = 0;

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
    if (((Checkbox)e.getSource()).equals(this.list.get(this.cursor))) {
      this.list.get(this.cursor).setEnabled(false);
      this.list.get(this.cursor).setForeground(Color.GREEN);
      this.cursor++;
      if (this.cursor < this.list.size()) {
        this.list.get(this.cursor).setVisible(true);
      }
      else {

      }
    }
  }
}
