package controller;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class SettingsListListener implements ListSelectionListener {
  // The settings frame, containing the settings
  private SettingsFrame settingsF;

  /**
   * SettingsListListener constructor.
   * Checks if given parameters are valid, and throws an exception otherwise.
   * @param settingsF the settings panel, containing the list
   */
  public SettingsListListener(SettingsFrame settingsF) {
    if (settingsF != null) {
      this.settingsF = settingsF;
    } else {
      throw new NullPointerException();
    }
  }

  /**
   * Called when user selects a value.
   * @param ev the list selection event
   */
  public void valueChanged(ListSelectionEvent ev) {
    JList<String> list = (JList<String>)ev.getSource();
    this.settingsF.getSwitchableCL().show(this.settingsF.getSwitchablePanel(), list.getSelectedValue().toString());
  }
}
