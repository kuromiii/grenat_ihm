package controller;

import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class TopBarButtonListener implements ActionListener {
  // The top bar, containing the buttons
  private TopBar topB;
  // The main frame, containing the switchable panel
  private MainFrame mainF;

  /**
   * TopBarButtonListener constructor.
   * Checks if given parameters are valid, and throws an exception otherwise
   * @param topB  the top bar, containing the buttons
   * @param mainF the main frame, containing the switchable panel
   */
  public TopBarButtonListener(TopBar topB, MainFrame mainF) {
    if (topB != null && mainF != null) {
      this.topB = topB;
      this.mainF = mainF;
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
    if (ev.getSource() == this.topB.getLogoButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Main Menu");
    } else if (ev.getSource() == this.topB.getMapButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Map");
    } else if (ev.getSource() == this.topB.getVehicleButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Vehicle");
    } else if (ev.getSource() == this.topB.getCalendarButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Calendar");
    } else if (ev.getSource() == this.topB.getSettingsButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Settings");
    }
  }
}
