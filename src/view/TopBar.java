package view;
import java.awt.*;
import javax.swing.*;

public class TopBar extends JPanel {
  ImageIcon logo;
  JButton Itineraire;
  JButton Fonctionnel;
  JButton Agenda;
  JButton Parametres;

  private static final Color COLOR = new Color(255, 138, 128);

  public TopBar() {
    this.logo = new ImageIcon("../img/LogoSmall.png");
    this.Itineraire = new JButton("Itinéraire");
    this.Fonctionnel = new JButton("Fonctionnel");
    this.Agenda = new JButton("Agenda");
    this.Parametres = new JButton("Parametres");

    JPanel b = new JPanel();
    b.add(this.Itineraire);
    b.add(this.Fonctionnel);
    b.add(this.Agenda);
    b.add(this.Parametres);
    b.setBackground(COLOR);

    add(new JLabel(this.logo));
    add(b);
    setBackground(COLOR);
  }
}
