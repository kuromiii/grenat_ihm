package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class HomePageFrame extends JPanel {
  // The parent frame
  private MainFrame parent;

  // The logo JButton
  private JButton logoBtn;

  /**
   * HomePageFrame constructor.
   * Checks if parent is valid, throws an error otherwise.
   * Then, initializes components.
   * @param parent the parent frame, needed by the GoBackHomeButtonListener
   */
  public HomePageFrame(MainFrame parent) {
    if (parent != null) {
      this.parent = parent;
      this.initComponents();
    } else {
      throw new NullPointerException();
    }
  }

  /**
   * Initializes components of the Panel.
   */
  public void initComponents() {
    Image logo = (new ImageIcon("../img/Logo.png")).getImage();
    Image rescaledLogo = logo.getScaledInstance(500, 500, Image.SCALE_SMOOTH);

    this.logoBtn = new JButton();
    this.logoBtn.setIcon(new ImageIcon(rescaledLogo));
    this.logoBtn.setOpaque(false);
    this.logoBtn.setContentAreaFilled(false);
    this.logoBtn.setBorderPainted(false);
    this.logoBtn.addActionListener(new GoBackHomeButtonListener(this.parent));

    this.setLayout(new BorderLayout());
    this.add(logoBtn);
  }

  /**
   * Returns the logo JButton.
   * @return the logo JButton
   */
  public JButton getLogoButton() {
    return this.logoBtn;
  }
}
