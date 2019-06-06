package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
  private TopBar topBar;

  private JPanel switchablePanel;
  private CardLayout switchableCL;

  // Different panels of the application, needs to be loaded here
  CalenderFrame calenderFrame;
  MainMenuFrame mainMenuFrame;
  MapFrame mapFrame;
  SettingsFrame settingsFrame;
  VehicleFrame vehicleFrame;
  ChecklistFrameBus ckFrameBus;
  ChecklistFrameMetro ckFrameMetro;
  ChecklistFrameTrain ckFrameTrain;

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

    this.mainMenuFrame = new MainMenuFrame(this);
    this.calenderFrame = new CalenderFrame();
    this.mapFrame = new MapFrame();
    this.settingsFrame = new SettingsFrame();
    this.vehicleFrame = new VehicleFrame(this);
    this.ckFrameMetro = new ChecklistFrameMetro();
    this.ckFrameBus = new ChecklistFrameBus();
    this.ckFrameTrain = new ChecklistFrameTrain();

    this.switchablePanel = new JPanel(new CardLayout());

    this.switchablePanel.add(this.mainMenuFrame, "Main Menu");
    this.switchablePanel.add(this.calenderFrame, "Calender");
    this.switchablePanel.add(this.mapFrame, "Map");
    this.switchablePanel.add(this.settingsFrame, "Settings");
    this.switchablePanel.add(this.vehicleFrame, "Vehicle");
    this.switchablePanel.add(this.ckFrameMetro, "Metro");
    this.switchablePanel.add(this.ckFrameBus, "Bus");
    this.switchablePanel.add(this.ckFrameTrain, "Train");

    this.switchableCL = (CardLayout)(this.switchablePanel.getLayout());
    this.switchableCL.show(this.switchablePanel, "Main Menu");

    this.add(this.topBar, BorderLayout.NORTH);
    this.add(this.switchablePanel, BorderLayout.CENTER);
    this.setResizable(false);
  }

  public JPanel getSwitchablePanel() {
    return this.switchablePanel;
  }


  public CardLayout getSwitchableCL() {
    return this.switchableCL;
  }

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        MainFrame gui = new MainFrame();
      }
    });
  }
}
