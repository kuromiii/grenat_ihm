package controller;

import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class MainMenuButtonListener implements ActionListener {
  private MainFrame mainF;
  private MainMenuFrame mainMenuF;

  public MainMenuButtonListener(MainFrame mainF, MainMenuFrame mainMenuF) {
    if (mainF != null && mainMenuF != null) {
      this.mainF = mainF;
      this.mainMenuF = mainMenuF;
    } else {
      throw new NullPointerException();
    }
  }

  public void actionPerformed(ActionEvent ev) {
    if (ev.getSource() == this.mainMenuF.getItineraireButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Map");
    } else if (ev.getSource() == this.mainMenuF.getAgendaButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Calender");
    } else {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Vehicle");
    }
  }
}
