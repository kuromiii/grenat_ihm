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
    } else {
      throw new NullPointerException();
    }
  }

  public void initComponents() {
    Image logo = (new ImageIcon("../img/Logo.png")).getImage();
    Image rescaledLogo = logo.getScaledInstance(500, 500, Image.SCALE_SMOOTH);

    this.logoBtn = new JButton();
    this.logoBtn.setIcon(new ImageIcon(rescaledLogo));
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
