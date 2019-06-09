package view;
import java.awt.*;
import javax.swing.*;

import controller.*;

public class MainMenuFrame extends JPanel {

  private MainFrame parent;

  // Buttons with images
  private JButton mapBtn, calendarBtn, vehicleBtn;
  // Buttons with text
  private JButton mapTextBtn, calendarTextBtn, vehicleTextBtn;
  // Color of buttons
  private final Color BUTTON_COLOR = new Color(251, 232, 232);

    /**
     * MainMenuFrame constructor.
     * Checks if the given parent is valid, throws an error otherwise.
     * Then, initializes components.
     * @param parent the parent frame, needed by the MainMenuButtonListener
     */
    public MainMenuFrame(MainFrame parent) {
      if (parent != null) {
        this.parent = parent;
        this.initComponent();
      } else {
        throw new NullPointerException();
      }
    }

    /**
     * Initializes components of the Panel.
     */
    private void initComponent() {
      this.setLayout(new BorderLayout());
      MainMenuButtonListener mainMenuListener = new MainMenuButtonListener(this.parent, this);

      // Map Image
      Image mapImg = (new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Itineraire.png")))).getImage();
      Image rescaledMapImg = mapImg.getScaledInstance(120,120,Image.SCALE_SMOOTH);

      // Calendar Image
      Image calendarImg = (new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Agenda.png")))).getImage();
      Image rescaledCalendarImg = calendarImg.getScaledInstance(120,120,Image.SCALE_SMOOTH);

      // Vehicle Image
      Image vehicleImg = (new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Transport.png")))).getImage();
      Image rescaledVehicleImg = vehicleImg.getScaledInstance(120,120,Image.SCALE_SMOOTH);

      // Map Button
      this.mapBtn = new JButton();
      this.mapBtn.setBackground(this.BUTTON_COLOR);
      this.mapBtn.setIcon(new ImageIcon(rescaledMapImg));
      this.mapBtn.addActionListener(mainMenuListener);

      // Calendar Button
      this.calendarBtn = new JButton();
      this.calendarBtn.setBackground(this.BUTTON_COLOR);
      this.calendarBtn.setIcon(new ImageIcon(rescaledCalendarImg));
      this.calendarBtn.addActionListener(mainMenuListener);

      // Vehicle Button
      this.vehicleBtn = new JButton();
      this.vehicleBtn.setBackground(this.BUTTON_COLOR);
      this.vehicleBtn.setIcon(new ImageIcon(rescaledVehicleImg));
      this.vehicleBtn.addActionListener(mainMenuListener);

      // Map Text Button
      this.mapTextBtn = new JButton("Itineraire");
      this.mapTextBtn.setBackground(this.BUTTON_COLOR);
      this.mapTextBtn.addActionListener(mainMenuListener);

      // Calendar Text Button
      this.calendarTextBtn = new JButton ("Agenda");
      this.calendarTextBtn.setBackground(this.BUTTON_COLOR);
      this.calendarTextBtn.addActionListener(mainMenuListener);

      // Vehicle Text Button
      this.vehicleTextBtn = new JButton("Transports");
      this.vehicleTextBtn.setBackground(this.BUTTON_COLOR);
      this.vehicleTextBtn.addActionListener(mainMenuListener);

      JPanel centralPanel = new JPanel(new GridLayout(1,5));

      JPanel itineraire = new JPanel(new BorderLayout());
      itineraire.add(this.mapBtn,BorderLayout.CENTER);
      itineraire.add(this.mapTextBtn,BorderLayout.SOUTH);

      JPanel itineraireContainer = new JPanel(new GridLayout(3,1));
      itineraireContainer.add(new JPanel());
      itineraireContainer.add(itineraire);
      itineraireContainer.add(new JPanel());
      centralPanel.add(itineraireContainer);
      centralPanel.add(new JLabel(""));

      JPanel agenda = new JPanel(new BorderLayout());
      agenda.add(this.calendarBtn,BorderLayout.CENTER);
      agenda.add(this.calendarTextBtn,BorderLayout.SOUTH);

      JPanel agendaContainer = new JPanel(new GridLayout(3,1));
      agendaContainer.add(new JPanel());
      agendaContainer.add(agenda);
      agendaContainer.add(new JPanel());
      centralPanel.add(agendaContainer);
      centralPanel.add(new JLabel(""));

      JPanel transports = new JPanel (new BorderLayout());
      transports.add(this.vehicleBtn,BorderLayout.CENTER);
      transports.add(this.vehicleTextBtn,BorderLayout.SOUTH);

      JPanel transportsContainer = new JPanel(new GridLayout(3,1));
      transportsContainer.add(new JPanel());
      transportsContainer.add(transports);
      transportsContainer.add(new JPanel());
      centralPanel.add(transportsContainer);

      JPanel centralContainer = new JPanel(new BorderLayout());
      centralContainer.add(new JLabel(" "),BorderLayout.WEST);
      centralContainer.add(new JLabel(" "),BorderLayout.EAST);
      centralContainer.add(centralPanel,BorderLayout.CENTER);
      add(centralContainer,BorderLayout.CENTER);
    }

    /**
     * Returns the map JButton.
     * @return the map JButton
     */
    public JButton getMapButton() {
      return this.mapBtn;
    }

    /**
     * Returns the calendar JButton.
     * @return the calendar JButton
     */
    public JButton getCalendarButton() {
      return this.calendarBtn;
    }

    /**
     * Returns the vehicle JButton.
     * @return the vehicle JButton
     */
    public JButton getVehicleButton() {
      return this.vehicleBtn;
    }
}
