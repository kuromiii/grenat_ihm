package view;
import java.awt.*;
import javax.swing.*;
import java.io.IOException;

public class MapFrame extends JPanel {

  private JTextField addressBeginField;
  private JTextField addressEndField;

    /**
     * MapFrame constructor.
     * Initializes components.
     */
    public MapFrame() {
      this.initComponent();
    }

    /**
     * Initializes components of the panel.
     */
    public void initComponent() {
      JPanel left = new JPanel(new BorderLayout());

      this.addressBeginField = new JTextField("Adresse de depart");
      this.addressEndField = new JTextField("Adresse d'arrivee");

      // This is the biggest hack ever, we basically fill a JTextField with \n,
      // in order to have padding under the address panel
      JTextArea hack = new JTextArea("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      hack.setEditable(false);

      JPanel upperLeft = new JPanel(new BorderLayout());
      JPanel itineraire = new JPanel(new GridLayout(2,1));

      JPanel beginPanel = new JPanel(new GridLayout(1,2));
      beginPanel.add(this.addressBeginField);
      beginPanel.add(new JLabel(new ImageIcon("../img/Pin.png")));
      itineraire.add(beginPanel);

      JPanel endPanel = new JPanel(new GridLayout(1,2));
      endPanel.add(this.addressEndField);
      endPanel.add(new JLabel(new ImageIcon("../img/HousePin.png")));
      itineraire.add(endPanel);

      upperLeft.add(itineraire,BorderLayout.NORTH);
      upperLeft.add(hack,BorderLayout.SOUTH);

      this.add(upperLeft, BorderLayout.WEST);
      this.add(new JLabel(new ImageIcon("../img/map.png")),BorderLayout.CENTER);
    }

}
