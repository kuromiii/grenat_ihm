package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
  // Top bar
  private TopBar topBar;

  // The switchable panel
  private JPanel switchablePanel;
  private CardLayout switchableCL;

  // Different panels of the application
  CalenderFrame calenderFrame;
  MainMenuFrame mainMenuFrame;
  MapFrame mapFrame;
  SettingsFrame settingsFrame;
  VehicleFrame vehicleFrame;
  ChecklistFrameBus ckFrameBus;
  ChecklistFrameMetro ckFrameMetro;
  ChecklistFrameTrain ckFrameTrain;
  HomePageFrame homePage;
  VictoryScreen victory;

  /**
   * MainFrame constructor.
   * Set the Frame title, the icon, then initializes the components.
   */
  public MainFrame() {
    super("Grenat");

    // Set the application's logo
    this.setIconImage(new ImageIcon(("../img/Logo.png")).getImage());

    this.getContentPane().setLayout(new BorderLayout());

    // Exit the whole application on closing the frame
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    // Initialize components
    this.initComponents();

    // Adjust size
    this.pack();
    this.setResizable(false);
    this.setSize(1300, 650);

    this.setVisible(true);
  }

  /**
   * Initializes components of the Panel.
   */
  private void initComponents() {
    this.topBar = new TopBar(this);

    // Different panels of the application, needs to be loaded here
    this.mainMenuFrame = new MainMenuFrame(this);
    this.calenderFrame = new CalenderFrame();
    this.mapFrame = new MapFrame();
    this.settingsFrame = new SettingsFrame();
    this.vehicleFrame = new VehicleFrame(this);
    this.ckFrameMetro = new ChecklistFrameMetro(this);
    this.ckFrameBus = new ChecklistFrameBus(this);
    this.ckFrameTrain = new ChecklistFrameTrain(this);
    this.homePage = new HomePageFrame(this);
    this.victory = new VictoryScreen(this);

    this.switchablePanel = new JPanel(new CardLayout());

    // Then we need to add the different panels to the switchable panel's list
    this.switchablePanel.add(this.mainMenuFrame, "Main Menu");
    this.switchablePanel.add(this.calenderFrame, "Calendar");
    this.switchablePanel.add(this.mapFrame, "Map");
    this.switchablePanel.add(this.settingsFrame, "Settings");
    this.switchablePanel.add(this.vehicleFrame, "Vehicle");
    this.switchablePanel.add(this.ckFrameMetro, "Metro");
    this.switchablePanel.add(this.ckFrameBus, "Bus");
    this.switchablePanel.add(this.ckFrameTrain, "Train");
    this.switchablePanel.add(this.homePage, "Home");
    this.switchablePanel.add(this.victory , "Victory");

    this.switchableCL = (CardLayout)(this.switchablePanel.getLayout());
    this.switchableCL.show(this.switchablePanel, "Home");

    this.add(this.topBar, BorderLayout.NORTH);
    this.add(this.switchablePanel, BorderLayout.CENTER);
  }

  /**
   * Returns the switchable panel.
   * @return the switchable panel
   */
  public JPanel getSwitchablePanel() {
    return this.switchablePanel;
  }

  /**
   * Returns the switchable panel's CardLayout, needed to actually change the panels.
   * @return the switchable panel's CardLayout
   */
  public CardLayout getSwitchableCL() {
    return this.switchableCL;
  }

  /**
    * Displays the victory screen
    */
    public void victory() {
      this.switchableCL.show(this.switchablePanel , "Victory");
    }
}
