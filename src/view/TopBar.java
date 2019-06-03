package view;

import java.awt.*;
import javax.swing.*;

public class TopBar extends JPanel {
  private MainFrame parent;

  private ImageIcon logo;

  private JButton itineraire, transports, agenda, parametres;

  private static final Color COLOR = new Color(173, 20, 87);

  public TopBar(MainFrame parent) {
    try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
    catch (ReflectiveOperationException e) {
      e.printStackTrace();
    }

    if (parent != null) {
      this.parent = parent;
    }

    initComponents();
  }

  public void initComponents() {
    this.logo = new ImageIcon("../img/LogoSmall.png");
    this.itineraire = new JButton("Itineraire");
    this.transports = new JButton("Transports");
    this.agenda = new JButton("Agenda");
    this.parametres = new JButton("Parametres");

    JPanel b = new JPanel();
    b.add(this.itineraire);
    b.add(this.transports);
    b.add(this.agenda);
    b.add(this.parametres);
    b.setBackground(COLOR);

    this.add(new JLabel(this.logo));
    this.add(b);
    this.setBackground(COLOR);
  }
}
