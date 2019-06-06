package view;
import java.awt.*;
import javax.swing.*;

import controller.*;

public class MainMenuFrame extends JPanel {

  private MainFrame parent;

  private JButton boutonItineraire;
  private JButton boutonAgenda;
  private JButton boutonTransport;
  private JButton boutonItineraireTexte;
  private JButton boutonAgendaTexte;
  private JButton boutonTransportTexte;
  private final Color COLOR = new Color(0xFBE8E8);

  /**
    *Creates a new MainMenuFrame object
    */
    public MainMenuFrame(MainFrame parent) {
      if (parent != null) {
        this.parent = parent;
        initComponent();
      }
    }

  /**
    *Initializes the components
    */
    private void initComponent() {
      MainMenuButtonListener mainMenuListener = new MainMenuButtonListener(this.parent, this);

      boutonItineraire = new JButton();
      boutonAgenda = new JButton();
      boutonTransport = new JButton();
      boutonItineraireTexte = new JButton("Itineraire");
      boutonAgendaTexte = new JButton ("Agenda");
      boutonTransportTexte = new JButton("Transports");

      boutonItineraire.addActionListener(mainMenuListener);
      boutonAgenda.addActionListener(mainMenuListener);
      boutonTransport.addActionListener(mainMenuListener);
      boutonItineraireTexte.addActionListener(mainMenuListener);
      boutonAgendaTexte.addActionListener(mainMenuListener);
      boutonTransportTexte.addActionListener(mainMenuListener);

      Image img = (new ImageIcon("../img/Itineraire.png")).getImage();
      Image newImg = img.getScaledInstance(120,120,Image.SCALE_SMOOTH);
      boutonItineraire.setIcon(new ImageIcon(newImg));
      Image img2 = (new ImageIcon("../img/Agenda.png")).getImage();
      Image newImg2 = img2.getScaledInstance(120,120,Image.SCALE_SMOOTH);
      boutonAgenda.setIcon(new ImageIcon(newImg2));
      Image img3 = (new ImageIcon("../img/Transport.png")).getImage();
      Image newImg3 = img3.getScaledInstance(120,120,Image.SCALE_SMOOTH);
      boutonTransport.setIcon(new ImageIcon(newImg3));

      this.boutonItineraire.setBackground(this.COLOR);
      this.boutonAgenda.setBackground(this.COLOR);
      this.boutonTransport.setBackground(this.COLOR);
      this.boutonItineraireTexte.setBackground(this.COLOR);
      this.boutonAgendaTexte.setBackground(this.COLOR);
      this.boutonTransportTexte.setBackground(this.COLOR);

      this.setLayout(new BorderLayout());

      JPanel centralPanel = new JPanel(new GridLayout(1,5));
      JPanel itineraire = new JPanel(new BorderLayout());
      itineraire.add(boutonItineraire,BorderLayout.CENTER);
      itineraire.add(boutonItineraireTexte,BorderLayout.SOUTH);

      JPanel itineraireContainer = new JPanel(new GridLayout(3,1));
      itineraireContainer.add(new JPanel());
      itineraireContainer.add(itineraire);
      itineraireContainer.add(new JPanel());
      centralPanel.add(itineraireContainer);
      centralPanel.add(new JLabel(""));

      JPanel agenda = new JPanel(new BorderLayout());
      agenda.add(boutonAgenda,BorderLayout.CENTER);
      agenda.add(boutonAgendaTexte,BorderLayout.SOUTH);
      JPanel agendaContainer = new JPanel(new GridLayout(3,1));
      agendaContainer.add(new JPanel());
      agendaContainer.add(agenda);
      agendaContainer.add(new JPanel());
      centralPanel.add(agendaContainer);
      centralPanel.add(new JLabel(""));

      JPanel transports = new JPanel (new BorderLayout());
      transports.add(boutonTransport,BorderLayout.CENTER);
      transports.add(boutonTransportTexte,BorderLayout.SOUTH);

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

    public JButton getItineraireButton() {
      return this.boutonItineraire;
    }

    public JButton getAgendaButton() {
      return this.boutonAgenda;
    }

    public JButton getTransportButton() {
      return this.boutonTransport;
    }
}
