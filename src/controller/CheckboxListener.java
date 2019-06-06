package controller;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

import view.*;

public class CheckboxListener extends ActionListener {

  private ArrayList<CheckboxInterface> list;

  public CheckboxListener (ArrayList<CheckboxInterface> list) {
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

}
