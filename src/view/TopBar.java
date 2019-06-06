package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class TopBar extends JPanel {
  private MainFrame parent;

  private JButton logoBtn, mapBtn, vehicleBtn, calendarBtn, settingsBtn;

  private static final Color COLOR = new Color(173, 20, 87);

  public TopBar(MainFrame parent) {
    if (parent != null) {
      this.parent = parent;
      this.initComponents();
    } else {
      throw new NullPointerException();
    }
  }

  public void initComponents() {
    TopBarButtonListener topBarListener = new TopBarButtonListener(this, this.parent);

    this.logoBtn = new JButton();
    this.logoBtn.setIcon(new ImageIcon("../img/LogoSmall.png"));
    this.logoBtn.setOpaque(false);
    this.logoBtn.setContentAreaFilled(false);
    this.logoBtn.setBorderPainted(false);
    this.logoBtn.addActionListener(topBarListener);

    this.mapBtn = new JButton("Itineraire");
    this.mapBtn.addActionListener(topBarListener);

    this.vehicleBtn = new JButton("Transports");
    this.vehicleBtn.addActionListener(topBarListener);

    this.calendarBtn = new JButton("Agenda");
    this.calendarBtn.addActionListener(topBarListener);

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

  public JButton getLogoButton() {
    return this.logoBtn;
  }

  public JButton getMapButton() {
    return this.mapBtn;
  }

  public JButton getVehicleButton() {
    return this.vehicleBtn;
  }

  public JButton getCalendarButton() {
    return this.calendarBtn;
  }

  public JButton getSettingsButton() {
    return this.settingsBtn;
  }
}
