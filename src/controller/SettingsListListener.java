package controller;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

import view.*;

public class SettingsListListener implements ListSelectionListener {
  private SettingsFrame settingsF;

  public SettingsListListener(SettingsFrame settingsF) {
    if (settingsF != null) {
      this.settingsF = settingsF;
    } else {
      throw new NullPointerException();
    }
  }

  public void valueChanged(ListSelectionEvent ev) {
    JList<String> list = (JList<String>)ev.getSource();
    this.settingsF.getSwitchableCL().show(this.settingsF.getSwitchablePanel(), list.getSelectedValue().toString());
  }
}
