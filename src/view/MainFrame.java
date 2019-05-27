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

    this.getContentPane().setLayout(new GridLayout(2,2));

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    // Initialize components
    this.initComponents();

    // Adjust size
    this.pack();
  }

  private void initComponents() {

  }

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        MainFrame gui = new MainFrame();
      }
    });
  }
}
