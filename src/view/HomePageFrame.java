package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class HomePageFrame extends JPanel {
  private MainFrame parent;

  private JButton logoBtn;

  public HomePageFrame(MainFrame parent) {
    if (parent != null) {
      this.parent = parent;
      this.initComponents();
    }
  }


  public void initComponents() {
    this.logoBtn = new JButton();

    Image logo = (new ImageIcon("../img/Logo.png")).getImage();
    Image newLogo = logo.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
    this.logoBtn.setIcon(new ImageIcon(newLogo));

    this.logoBtn.setOpaque(false);
    this.logoBtn.setContentAreaFilled(false);
    this.logoBtn.setBorderPainted(false);
    this.logoBtn.addActionListener(new HomePageButtonListener(this.parent, this));

    this.setLayout(new BorderLayout());
    this.add(logoBtn);

  }

  public JButton getLogoButton() {
    return this.logoBtn;
  }
}
