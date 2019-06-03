package view;
import java.awt.*;
import javax.swing.*;

public class MainMenuFrame extends JPanel {

  private JButton boutonItineraire;
  private JButton boutonAgenda;
  private JButton boutonTransport;
  private JButton boutonItineraireTexte;
  private JButton boutonAgendaTexte;
  private JButton boutonTransportTexte;

  /**
    *Creates a new MainMenuFrame object
    */
    public MainMenuFrame() {
      initComponent();
    }

  /**
    *Initializes the components
    */
    private void initComponent() {
      boutonItineraire = new JButton();
      boutonAgenda = new JButton();
      boutonTransport = new JButton();
      boutonItineraireTexte = new JButton("Itineraire");
      boutonAgendaTexte = new JButton ("Agenda");
      boutonTransportTexte = new JButton("Transports");
      setLayout(new BorderLayout());
      JPanel centralPanel = new JPanel(new GridLayout(1,3));
      JPanel itineraire = new JPanel(new BorderLayout());
      boutonItineraire.setIcon("../img/Itineraire.png");
      itineraire.add(boutonItineraire,BorderLayout.CENTER);
      itineraire.add(boutonItineraire,BorderLayout.SOUTH);
      centralPanel.add(itineraire);
      JPanel agenda = new JPanel(new BorderLayout());
      boutonAgenda.setIcon("../img/Agenda.png");
      agenda.add(boutonAgenda);
      agenda.add(boutonAgendaTexte);
      centralPanel.add(agenda);
      JPanel transports = new JPanel (new BorderLayout());
      boutonTransport.setIcon("../img/Transport.png");
      transports.add(boutonTransport);
      transports.add(boutonTransportTexte);
      centralPanel.add(transports);
      add(transports,BorderLayout.CENTER);
    }
}
