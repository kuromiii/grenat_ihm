package controller;

import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class GoBackHomeButtonListener implements ActionListener {
  private MainFrame mainF;

  public GoBackHomeButtonListener(MainFrame mainF) {
    if (mainF != null) {
      this.mainF = mainF;
    } else {
      throw new NullPointerException();
    }
  }

  public void actionPerformed(ActionEvent ev) {
    this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Main Menu");
  }
}
