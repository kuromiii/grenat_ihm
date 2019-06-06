package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class HomePageFrame extends JPanel {
  private MainFrame parent;

  private JButton boutonLogo;

  public HomePageFrame(MainFrame parent) {
    if (parent != null) {
      this.parent = parent;
      this.initComponents();
    }
  }


  public void initComponents() {
    this.boutonLogo = new JButton();

    Image logo = (new ImageIcon("../img/Logo.png")).getImage();
    Image newLogo = logo.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
    this.boutonLogo.setIcon(new ImageIcon(newLogo));

    this.boutonLogo.setOpaque(false);
    this.boutonLogo.setContentAreaFilled(false);
    this.boutonLogo.setBorderPainted(false);
    this.boutonLogo.addActionListener(new HomePageButtonListener(this.parent, this));

    this.setLayout(new BorderLayout());
    this.add(boutonLogo);

  }

  public JButton getLogoButton() {
    return this.boutonLogo;
  }
}
