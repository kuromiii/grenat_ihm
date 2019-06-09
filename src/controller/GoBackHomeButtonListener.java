package controller;

import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class GoBackHomeButtonListener implements ActionListener {
  private MainFrame mainF;

  /**
   * GoBackHomeButtonListener constructor.
   * Checks if given parameters are valid, and throws an exception otherwise
   * @param mainF the main frame, containing the switchable panel
   */
  public GoBackHomeButtonListener(MainFrame mainF) {
    if (mainF != null) {
      this.mainF = mainF;
    } else {
      throw new NullPointerException();
    }
  }

  /**
   * Go back to the main menu when the user clicks on the JButton
   * @param ev the action event
   */
  public void actionPerformed(ActionEvent ev) {
    this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Main Menu");
  }
}
