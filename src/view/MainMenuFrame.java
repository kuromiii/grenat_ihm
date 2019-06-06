package view;
import java.awt.*;
import javax.swing.*;

import controller.*;

public class MainMenuFrame extends JPanel {

  private MainFrame parent;

  private JButton mapBtn, calendarBtn, vehicleBtn;
  private JButton mapTextBtn, calendarTextBtn, vehicleTextBtn;

  private final Color BUTTON_COLOR = new Color(251, 232, 232);

  /**
    *Creates a new MainMenuFrame object
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
    *Initializes the components
    */
    private void initComponent() {
      MainMenuButtonListener mainMenuListener = new MainMenuButtonListener(this.parent, this);

      Image mapImg = (new ImageIcon("../img/Itineraire.png")).getImage();
      Image rescaledMapImg = mapImg.getScaledInstance(120,120,Image.SCALE_SMOOTH);

      Image calendarImg = (new ImageIcon("../img/Agenda.png")).getImage();
      Image rescaledCalendarImg = calendarImg.getScaledInstance(120,120,Image.SCALE_SMOOTH);

      Image vehicleImg = (new ImageIcon("../img/Transport.png")).getImage();
      Image rescaledVehicleImg = vehicleImg.getScaledInstance(120,120,Image.SCALE_SMOOTH);

      this.mapBtn = new JButton();
      this.mapBtn.setBackground(this.BUTTON_COLOR);
      this.mapBtn.setIcon(new ImageIcon(mapImg));
      this.mapBtn.addActionListener(mainMenuListener);

      this.calendarBtn = new JButton();
      this.calendarBtn.setBackground(this.BUTTON_COLOR);
      this.calendarBtn.setIcon(new ImageIcon(calendarImg));
      this.calendarBtn.addActionListener(mainMenuListener);

      this.vehicleBtn = new JButton();
      this.vehicleBtn.setBackground(this.BUTTON_COLOR);
      this.vehicleBtn.setIcon(new ImageIcon(vehicleImg));
      this.vehicleBtn.addActionListener(mainMenuListener);

      this.mapTextBtn = new JButton("Itineraire");
      this.mapTextBtn.setBackground(this.BUTTON_COLOR);
      this.mapTextBtn.addActionListener(mainMenuListener);

      this.calendarTextBtn = new JButton ("Agenda");
      this.calendarTextBtn.setBackground(this.BUTTON_COLOR);
      this.calendarTextBtn.addActionListener(mainMenuListener);

      this.vehicleTextBtn = new JButton("Transports");
      this.vehicleTextBtn.setBackground(this.BUTTON_COLOR);
      this.vehicleTextBtn.addActionListener(mainMenuListener);

      this.setLayout(new BorderLayout());

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

    public JButton getMapButton() {
      return this.mapBtn;
    }

    public JButton getCalendarButton() {
      return this.calendarBtn;
    }

    public JButton getVehicleButton() {
      return this.vehicleBtn;
    }
}
