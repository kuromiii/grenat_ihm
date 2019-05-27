package view;
import java.awt.*;
import javax.swing.*;
import java.io.IOException;

public class MapFrame extends JPanel {

  private JPanel left;
  private JTextField depart;
  private JTextField arrive;
  private JTextArea info;

  /**
    *Creates a new MapFrame object
    */
    public MapFrame() {
      initComponent();
    }

  /**
    *Initializes the components
    */
    public void initComponent() {
      this.left = new JPanel();
      this.depart = new JTextField("Adresse de depart");
      this.arrive = new JTextField("Adresse d'arrivee");
      this.info = new JTextArea("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      this.left.setLayout(new BorderLayout());
      this.info.setEditable(false);
      JPanel upperLeft = new JPanel(new BorderLayout());
      JPanel itineraire = new JPanel(new GridLayout(2,1));
      JPanel d = new JPanel(new GridLayout(1,2));
      d.add(this.depart);
      d.add(new JLabel(new ImageIcon("../img/Pin.png")));
      itineraire.add(d);
      JPanel a = new JPanel(new GridLayout(1,2));
      a.add(this.arrive);
      a.add(new JLabel(new ImageIcon("../img/HousePin.png")));
      itineraire.add(a);
      upperLeft.add(itineraire,BorderLayout.NORTH);
      upperLeft.add(this.info,BorderLayout.SOUTH);
      add(upperLeft, BorderLayout.WEST);

      add(new JLabel(new ImageIcon("../img/map.png")),BorderLayout.CENTER);
    }

}
