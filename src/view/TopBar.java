package view;

import java.awt.*;
import javax.swing.*;

public class TopBar extends JPanel {
  ImageIcon logo;
  JButton Itineraire;
  JButton Fonctionnel;
  JButton Agenda;
  JButton Parametres;

  private static final Color COLOR = new Color(173, 20, 87);

  public TopBar() {
    try {
			UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName());
		}
		catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace ();
		}
    catch (ReflectiveOperationException e) {
      e.printStackTrace ();
    }


    this.logo = new ImageIcon("../img/LogoSmall.png");
    this.Itineraire = new JButton("Itineraire");
    this.Fonctionnel = new JButton("Fonctionnel");
    this.Agenda = new JButton("Agenda");
    this.Parametres = new JButton("Parametres");

    JPanel b = new JPanel();
    b.add(this.Itineraire);
    b.add(this.Fonctionnel);
    b.add(this.Agenda);
    b.add(this.Parametres);
    b.setBackground(COLOR);

    this.add(new JLabel(this.logo));
    this.add(b);
    this.setBackground(COLOR);
  }
}
