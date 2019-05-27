package view;
import java.awt.*;
import javax.swing.*;

public class MapFrame extends JPanel {

  private TopBar top;
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
      this.top = new TopBar();
      this.left = new JPanel();
      this.depart = new JTextField("Adresse de départ");
      this.arrive = new JTextField("Adresse d'arrivée");
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
      add(top, BorderLayout.NORTH);
    }

}
