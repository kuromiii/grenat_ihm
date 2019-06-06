package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class TopBar extends JPanel {
  private MainFrame parent;

  private ImageIcon logo;

  private JButton itineraire, transports, agenda, parametres;

  private static final Color COLOR = new Color(173, 20, 87);

  public TopBar(MainFrame parent) {
    if (parent != null) {
      this.parent = parent;
    }

    initComponents();
  }

  public void initComponents() {
    TopBarButtonListener topBarListener = new TopBarButtonListener(this, this.parent);

    this.logo = new ImageIcon("../img/LogoSmall.png");

    this.itineraire = new JButton("Itineraire");
    this.itineraire.addActionListener(topBarListener);

    this.transports = new JButton("Transports");
    this.transports.addActionListener(topBarListener);

    this.agenda = new JButton("Agenda");
    this.agenda.addActionListener(topBarListener);

    this.parametres = new JButton("Parametres");
    this.parametres.addActionListener(topBarListener);

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

  public JButton getItineraireButton() {
    return this.itineraire;
  }

  public JButton getTransportsButton() {
    return this.transports;
  }

  public JButton getAgendaButton() {
    return this.agenda;
  }

  public JButton getParametresButton() {
    return this.parametres;
  }
}
