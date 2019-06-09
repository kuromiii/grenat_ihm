package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class SettingsFrame extends JPanel {

  // The TopBar used in the application
  private TopBar topBar;

  // The bottom panel used for displaying battery and wifi
  private JPanel down;

  // Images used for battery and wifi
  private final Image battery = new ImageIcon("../img/Batterie.png").getImage();
  private final Image wifi = new ImageIcon("../img/Wifi.png").getImage();
  private JLabel batteryLabel;
  private JLabel wifiLabel;

  // The switchable panel
  private JPanel switchablePanel;
  private CardLayout switchableCL;

  // Different panels of the settings
  private AppearanceFrame appearanceFrame;
  private AccessibilityFrame accessibilityFrame;
  private BatteryUsageFrame batteryUsageFrame;
  private DataUsageFrame dataUsageFrame;

  // The setting list
  private JList<String> settingsList;

  /**
   * SettingsFrame constructor.
   * Checks if parent is valid, throws an error otherwise.
   * Then, initializes components.
   * @param topBar the topBar used in the application
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

    this.down = new JPanel(new GridLayout(1,4));

    this.batteryLabel = new JLabel(new ImageIcon(this.battery));
    this.wifiLabel = new JLabel(new ImageIcon(this.wifi));

    this.appearanceFrame = new AppearanceFrame(this.topBar);
    this.accessibilityFrame = new AccessibilityFrame();
    this.batteryUsageFrame = new BatteryUsageFrame(this.batteryLabel);
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

    // Padding
    this.down.add(new JPanel());
    this.down.add(new JPanel());
    this.down.add(new JPanel());

    JPanel icons = new JPanel(new GridLayout(1,2));
    icons.add(this.batteryLabel);
    icons.add(this.wifiLabel);
    this.batteryLabel.setVisible(false);
    this.wifiLabel.setVisible(false);

    this.down.add(icons);

    this.add(this.down,BorderLayout.SOUTH);
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
