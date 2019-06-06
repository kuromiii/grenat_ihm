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

  }
}
