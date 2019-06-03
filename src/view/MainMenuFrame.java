package view;
import java.awt.*;
import javax.swing.*;

public class MainMenuFrame extends JPanel {

  private JButton boutonItineraire;
  private JButton boutonAgenda;
  private JButton boutonFonctionnel;
  private JButton boutonItineraireTexte;
  private JButton boutonAgendaTexte;
  private JButton boutonFonctionnelTexte;

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
      boutonFonctionnel = new JButton();
      boutonItineraireTexte = new JButton("Itineraire");
      boutonAgendaTexte = new JButton ("Agenda");
      boutonFonctionnelTexte = new JButton("Fonctionnel");
      setLayout(new BorderLayout());
      add(new TopBar(),BorderLayout.NORTH);
      JPanel centralPanel = new JPanel(new GridLayout(1,3));
      JPanel itineraire = new JPanel(new BorderLayout());
    //  boutonItineraire.setIcon("../img/")
    }
}
