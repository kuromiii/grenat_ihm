package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
  private TopBar topBar;
  private JPanel switchablePanel;

  CalenderFrame calenderFrame;
  ChecklistFrame checklistFrame;
  MainMenuFrame mainMenuFrame;
  MapFrame mapFrame;
  SettingsFrame settingsFrame;
  VehicleFrame vehicleFrame;

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
    this.topBar = new TopBar(this);

    this.calenderFrame = new CalenderFrame();
    this.checklistFrame = new ChecklistFrame();
    this.mainMenuFrame = new MainMenuFrame();
    this.mapFrame = new MapFrame();
    this.settingsFrame = new SettingsFrame();
    this.vehicleFrame = new VehicleFrame();

    this.switchablePanel = new JPanel(new CardLayout());

    this.switchablePanel.add(this.calenderFrame, "Calender");
    this.switchablePanel.add(this.checklistFrame, "Checklist");
    this.switchablePanel.add(this.mainMenuFrame, "Main Menu");
    this.switchablePanel.add(this.mapFrame, "Map");
    this.switchablePanel.add(this.settingsFrame, "Settings");
    this.switchablePanel.add(this.vehicleFrame, "Vehicle");

    CardLayout cl = (CardLayout)(this.switchablePanel.getLayout());
    cl.show(this.switchablePanel, "Vehicle");

    this.add(this.topBar, BorderLayout.NORTH);
    this.add(this.switchablePanel, BorderLayout.CENTER);
  }

  public JPanel getSwitchablePanel() {
    return this.switchablePanel;
  }

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        MainFrame gui = new MainFrame();
      }
    });
  }
}
