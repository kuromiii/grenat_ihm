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


      Image img = (new ImageIcon("../img/Itinéraire.png")).getImage();
      Image newImg = img.getScaledInstance(30,30,Image.SCALE_SMOOTH);
      boutonItineraire.setIcon(new ImageIcon(newImg));
      Image img2 = (new ImageIcon("../img/Agenda.png")).getImage();
      Image newImg2 = img2.getScaledInstance(30,30,Image.SCALE_SMOOTH);
      boutonAgenda.setIcon(new ImageIcon(newImg2));
      Image img3 = (new ImageIcon("../img/Transport.png")).getImage();
      Image newImg3 = img.getScaledInstance(30,30,Image.SCALE_SMOOTH);
      boutonTransport.setIcon(new ImageIcon(newImg3));


      setLayout(new BorderLayout());

      JPanel centralPanel = new JPanel(new GridLayout(1,3));
      JPanel itineraire = new JPanel(new BorderLayout());
      itineraire.add(boutonItineraire,BorderLayout.CENTER);
      itineraire.add(boutonItineraire,BorderLayout.SOUTH);
      centralPanel.add(itineraire);
      JPanel agenda = new JPanel(new BorderLayout());
      agenda.add(boutonAgenda);
      agenda.add(boutonAgendaTexte);
      centralPanel.add(agenda);
      JPanel transports = new JPanel (new BorderLayout());
      transports.add(boutonTransport);
      transports.add(boutonTransportTexte);
      centralPanel.add(transports);
      add(transports,BorderLayout.CENTER);
    }
}
