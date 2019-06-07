package view;

import java.awt.*;
import javax.swing.*;

public class SettingsFrame extends JPanel {

  // The switchable panel
  private JPanel switchablePanel;
  private CardLayout switchableCL;

  // Different panels of the settings
  private AppearanceFrame appearanceFrame;
  private AccessibilityFrame accessibilityFrame;
  private BatteryUsageFrame batteryUsageFrame;
  private DataUsageFrame dataUsageFrame;

  /**
   * SettingsFrame constructor.
   * Initializes components.
   */
  public SettingsFrame() {
    this.initComponents();
  }

  /**
   * Initializes components of the panel.
   */
  public void initComponents() {
    this.setLayout(new BorderLayout());
    String[] settings = {"Apparence", "Accessibilite",
     "Utilisation de la batterie", "Utilisation du reseau"};
    JList<String> list = new JList<String>(settings);

    this.add(list,BorderLayout.WEST);

    this.appearanceFrame = new AppearanceFrame();
    this.accessibilityFrame = new AccessibilityFrame();
    this.batteryUsageFrame = new BatteryUsageFrame();
    this.dataUsageFrame = new DataUsageFrame();

    this.switchablePanel = new JPanel(new CardLayout());

    // Then we need to add the different panels to the switchable panel's list
    this.switchablePanel.add(this.appearanceFrame, "Apparence");
    this.switchablePanel.add(this.accessibilityFrame, "Accessibilite");
    this.switchablePanel.add(this.batteryUsageFrame, "Utilisation de la batterie");
    this.switchablePanel.add(this.dataUsageFrame, "Utilisation du reseau");

    this.switchablePanel = new JPanel(new CardLayout());
    this.switchableCL = (CardLayout)(this.switchablePanel.getLayout());

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
