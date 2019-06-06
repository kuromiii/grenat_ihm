package view;
import java.awt.*;
import javax.swing.*;
import java.io.IOException;

public class MapFrame extends JPanel {

  private JTextField adresseDepartField;
  private JTextField adresseArriveField;

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
      JPanel left = new JPanel(new BorderLayout());

      this.adresseDepartField = new JTextField("Adresse de depart");
      this.adresseArriveField = new JTextField("Adresse d'arrivee");

      JTextArea hack = new JTextArea("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      hack.setEditable(false);

      JPanel upperLeft = new JPanel(new BorderLayout());
      JPanel itineraire = new JPanel(new GridLayout(2,1));

      JPanel departPanel = new JPanel(new GridLayout(1,2));
      departPanel.add(this.adresseDepartField);
      departPanel.add(new JLabel(new ImageIcon("../img/Pin.png")));
      itineraire.add(departPanel);

      JPanel arivePanel = new JPanel(new GridLayout(1,2));
      arivePanel.add(this.adresseArriveField);
      arivePanel.add(new JLabel(new ImageIcon("../img/HousePin.png")));
      itineraire.add(arivePanel);

      upperLeft.add(itineraire,BorderLayout.NORTH);
      upperLeft.add(hack,BorderLayout.SOUTH);
      add(upperLeft, BorderLayout.WEST);
    //  Image originalImage = (new ImageIcon("../img/map.png")).getImage();
    //  Image scaledImage = originalImage.getScaledInstance(center.getWidth(),center.getHeight(),Image.SCALE_SMOOTH);
      add(new JLabel(new ImageIcon("../img/map.png")),BorderLayout.CENTER);
    }

}
