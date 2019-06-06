package controller;

import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class MainMenuButtonListener implements ActionListener {
  // The main frame, containing the swi switchable panel
  private MainFrame mainF;
  // The main menu frame, containing the buttons
  private MainMenuFrame mainMenuF;

  /**
   * MainMenuButtonListener constructor.
   * Checks if given parameters are valid, and throws an exception otherwise
   * @param mainF the main frame, containing the switchable panel
   * @param mainMenuF the man menu panel, containing the buttons
   */
  public MainMenuButtonListener(MainFrame mainF, MainMenuFrame mainMenuF) {
    if (mainF != null && mainMenuF != null) {
      this.mainF = mainF;
      this.mainMenuF = mainMenuF;
    } else {
      throw new NullPointerException();
    }
  }

  /**
   * Called when a button is clicked.
   * We switch the panel to a new one, depending on the button.
   * @param ev the action event
   */
  public void actionPerformed(ActionEvent ev) {
    if (ev.getSource() == this.mainMenuF.getMapButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Map");
    } else if (ev.getSource() == this.mainMenuF.getCalendarButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Calendar");
    } else if (ev.getSource() == this.mainMenuF.getVehicleButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Vehicle");
    }
  }
}
