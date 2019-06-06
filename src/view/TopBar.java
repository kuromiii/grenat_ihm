package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class TopBar extends JPanel {
  private MainFrame parent;
  // Buttons
  private JButton logoBtn, mapBtn, vehicleBtn, calendarBtn, settingsBtn;
  // Background color
  private static final Color COLOR = new Color(173, 20, 87);

  /**
   * TopBar constructor.
   * Checks if the parent is valid, throws an error otherwise.
   * @param parent the parent frame, needed by the TopBarButtonListener
   */
  public TopBar(MainFrame parent) {
    if (parent != null) {
      this.parent = parent;
      this.initComponents();
    } else {
      throw new NullPointerException();
    }
  }

  /**
   * Initializes components of the panel.
   */
  public void initComponents() {
    TopBarButtonListener topBarListener = new TopBarButtonListener(this, this.parent);

    // Logo button
    this.logoBtn = new JButton();
    this.logoBtn.setIcon(new ImageIcon("../img/LogoSmall.png"));
    this.logoBtn.setOpaque(false);
    this.logoBtn.setContentAreaFilled(false);
    this.logoBtn.setBorderPainted(false);
    this.logoBtn.addActionListener(topBarListener);

    // Map button
    this.mapBtn = new JButton("Itineraire");
    this.mapBtn.addActionListener(topBarListener);

    // Vehicle button
    this.vehicleBtn = new JButton("Transports");
    this.vehicleBtn.addActionListener(topBarListener);

    // Calendar button
    this.calendarBtn = new JButton("Agenda");
    this.calendarBtn.addActionListener(topBarListener);

    // Settings button
    this.settingsBtn = new JButton("Parametres");
    this.settingsBtn.addActionListener(topBarListener);

    JPanel b = new JPanel();
    b.add(this.logoBtn);
    b.add(this.mapBtn);
    b.add(this.vehicleBtn);
    b.add(this.calendarBtn);
    b.add(this.settingsBtn);
    b.setBackground(COLOR);

    this.add(b);
    this.setBackground(COLOR);
  }

  /**
   * Returns the logo button, used by TopBarButtonListener.
   * @return the logo button
   */
  public JButton getLogoButton() {
    return this.logoBtn;
  }

  /**
   * Returns the map button, used by TopBarButtonListener.
   * @return the map button
   */
  public JButton getMapButton() {
    return this.mapBtn;
  }

  /**
   * Returns the vehicle button, used by TopBarButtonListener.
   * @return the vehicle button
   */
  public JButton getVehicleButton() {
    return this.vehicleBtn;
  }

  /**
   * Returns the calendar button, used by TopBarButtonListener.
   * @return the calendar button
   */
  public JButton getCalendarButton() {
    return this.calendarBtn;
  }

  /**
   * Returns the settings button, used by TopBarButtonListener.
   * @return the settings JButton
   */
  public JButton getSettingsButton() {
    return this.settingsBtn;
  }
}
