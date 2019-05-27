package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
  private TopBar topBar;
  private JPanel switchablePanel;

  /**
   * Create a MainFrame object.
   */
  public MainFrame() {
    super("Grenat");

    // Set logo
    this.setIconImage(new ImageIcon(("../img/Logo.png")).getImage());

    this.getContentPane().setLayout(new BorderLayout());

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    // Initialize components
    this.initComponents();

    // Adjust size
    this.pack();

    this.setVisible(true);
  }

  private void initComponents() {
    this.topBar = new TopBar();
    //this.switchablePanel = new JPanel(new CardLayout());
    this.switchablePanel = new MapFrame();

    this.add(this.topBar, BorderLayout.NORTH);
    this.add(this.switchablePanel, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        MainFrame gui = new MainFrame();
      }
    });
  }
}
