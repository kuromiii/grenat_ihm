package view;
import java.awt.*;
import javax.swing.*;

public class TopBar extends JPanel {
  ImageIcon logo;
  JButton Itineraire;
  JButton Fonctionnel;
  JButton Agenda;
  JButton Parametres;

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

    add(new JLabel(this.logo));
    add(b);
    setBackground(Color.BLUE);
  }
}
