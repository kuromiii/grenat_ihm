package controller;

import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class HomePageButtonListener implements ActionListener {
  private MainFrame mainF;
  private HomePageFrame homeF;

  public HomePageButtonListener(MainFrame mainF, HomePageFrame homeF) {
    if (mainF != null && homeF != null) {
      this.mainF = mainF;
      this.homeF = homeF;
    } else {
      throw new NullPointerException();
    }
  }

  public void actionPerformed(ActionEvent ev) {
    if (ev.getSource() == this.homeF.getLogoButton()) {
      this.mainF.getSwitchableCL().show(this.mainF.getSwitchablePanel(), "Main Menu");
    }
  }
}
