package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class SettingsFrame extends JPanel {

  // The TopBar used in the application
  private TopBar topBar;

  // The switchable panel
  private JPanel switchablePanel;
  private CardLayout switchableCL;

  // Different panels of the settings
  private AppearanceFrame appearanceFrame;
  private AccessibilityFrame accessibilityFrame;
  private BatteryUsageFrame batteryUsageFrame;
  private DataUsageFrame dataUsageFrame;

  private JList<String> settingsList;

  /**
   * SettingsFrame constructor.
   * Initializes components.
   */
  public SettingsFrame(TopBar topBar) {
    if (topBar != null) {
      this.topBar = topBar;
      this.initComponents();
    }
    else {
      throw new NullPointerException();
    }

  }

  /**
   * Initializes components of the panel.
   */
  public void initComponents() {
    this.setLayout(new BorderLayout());
    String[] settings = {"Apparence", "Accessibilite",
     "Utilisation de la batterie", "Utilisation du reseau"};
    this.settingsList = new JList<String>(settings);
    this.settingsList.addListSelectionListener(new SettingsListListener(this));

    this.add(this.settingsList, BorderLayout.WEST);

    this.appearanceFrame = new AppearanceFrame(this.topBar);
    this.accessibilityFrame = new AccessibilityFrame();
    this.batteryUsageFrame = new BatteryUsageFrame();
    this.dataUsageFrame = new DataUsageFrame();

    this.switchablePanel = new JPanel(new CardLayout());

    // Then we need to add the different panels to the switchable panel's list
    this.switchablePanel.add(this.appearanceFrame, "Apparence");
    this.switchablePanel.add(this.accessibilityFrame, "Accessibilite");
    this.switchablePanel.add(this.batteryUsageFrame, "Utilisation de la batterie");
    this.switchablePanel.add(this.dataUsageFrame, "Utilisation du reseau");

    this.switchableCL = (CardLayout)(this.switchablePanel.getLayout());
    this.switchableCL.show(this.switchablePanel, "Apparence");

    this.add(this.switchablePanel);
  }

  /**
   * Returns the switchable panel.
   * @return the switchable panel
   */
  public JPanel getSwitchablePanel() {
    return this.switchablePanel;
  }

  /**
   * Returns the switchable panel's CardLayout, needed to actually change the panels.
   * @return the switchable panel's CardLayout
   */
  public CardLayout getSwitchableCL() {
    return this.switchableCL;
  }
}
