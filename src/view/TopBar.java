package view;
import java.awt.*;
import javax.swing.*;

public class TopBar extends JPanel {
  ImageIcon logo;
  JPanel barreLiens;
  JButton Itinéraire;
  JButton Fonctionnel;
  JButton Agenda;
  JButton Parametres;

  public TopBar() {
    this.logo = new ImageIcon("../img/logo.png");
    this.barreLiens = new JPanel();
    this.Itinéraire = new JButton("Itinéraire");
    this.Fonctionnel = new JButton("Fonctionnel");
    this.Agenda = new JButton("Agenda");
    this.Parametres = new JButton("Parametres");
  }
}
