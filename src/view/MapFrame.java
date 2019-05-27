package view;
import java.awt.*;
import javax.swing.*;
import java.io.IOException;

public class MapFrame extends JPanel {

  private JPanel left;
  private JTextField depart;
  private JTextField arrive;
  private JTextArea info;
  private JEditorPane map;

  /**
    *Create a new MapFrame object
    */
    public MapFrame() {
      initComponent();
    }

  /**
    *Initialize the components
    */
    public void initComponent() {
      this.left = new JPanel();
      this.depart = new JTextField("Adresse de depart");
      this.arrive = new JTextField("Adresse d'arrivee");
      this.info = new JTextArea();
      this.map = new JEditorPane();

      this.left.setLayout(new BorderLayout());
      JPanel upperLeft = new JPanel(new GridLayout(2,1));
      JPanel d = new JPanel(new GridLayout(1,2));
      d.add(this.depart);
      d.add(new JLabel(new ImageIcon("../img/Pin.png")));
      upperLeft.add(d);
      JPanel a = new JPanel(new GridLayout(2,1));
      a.add(this.arrive);
      a.add(new JLabel(new ImageIcon("../img/HousePin.png")));
      upperLeft.add(a);
      upperLeft.add(this.info);
      add(upperLeft, BorderLayout.WEST);

      map.setEditable(false);

      try {
        map.setPage("https://www.google.fr/maps/preview");
      }
      catch (IOException e) {
        map.setContentType("text/html");
        map.setText("<html>Could not load</html>");
      }

      add(map, BorderLayout.CENTER);
    }

}
