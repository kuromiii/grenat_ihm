package controller;

import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class TopBarButtonListener implements ActionListener {
  private TopBar topB;
  private MainFrame mainF;

  public TopBarButtonListener(TopBar topB, MainFrame mainF) {
    if (topB != null && mainF != null) {
      this.topB = topB;
      this.mainF = mainF;
    } else {
      throw new NullPointerException();
    }
  }

  public void actionPerformed(ActionEvent ev) {
    if (ev.getSource() == this.topB.getItineraireButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Map");
    } else if (ev.getSource() == this.topB.getTransportsButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Vehicle");
    } else if (ev.getSource() == this.topB.getAgendaButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Calender");
    } else {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Settings");
    }
  }
}
