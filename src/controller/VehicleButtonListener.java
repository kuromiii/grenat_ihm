package controller;

import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class VehicleButtonListener implements ActionListener {
  // The main frame, containing the switchable panel
  private MainFrame mainF;
  // The vehicle frame, containing the buttons
  private VehicleFrame vehiF;

  /**
   * VehicleButtonListener constructor.
   * Checks if given parameters are valid, and throws an exception otherwise
   * @param mainF the main frame, containing the switchable panel
   * @param vehiF the vehicle panel, containing the buttons
   */
  public VehicleButtonListener(MainFrame mainF, VehicleFrame vehiF) {
    if (mainF != null && vehiF != null) {
      this.mainF = mainF;
      this.vehiF = vehiF;
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
    if (ev.getSource() == this.vehiF.getBusButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Bus");
    } else if (ev.getSource() == this.vehiF.getMetroButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Metro");
    } else {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Train");
    }
  }
}
