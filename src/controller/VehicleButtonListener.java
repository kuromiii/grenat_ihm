package controller;

import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class VehicleButtonListener implements ActionListener {
  private MainFrame mainF;
  private VehicleFrame vehiF;

  public VehicleButtonListener(MainFrame mainF, VehicleFrame vehiF) {
    if (mainF != null && vehiF != null) {
      this.mainF = mainF;
      this.vehiF = vehiF;
    } else {
      throw new NullPointerException();
    }
  }

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
