package view;
import java.awt.*;
import javax.swing.*;

public class VictoryScreen extends JPanel {

  private ImageIcon img;
  private JButton button;

  /**
    *Creates a new VictoryScreen object
    */
    public VictoryScreen() {
      this.initComponent();
    }

  /**
    *Initializes the components
    */
    public void initComponent() {
      this.setLayout(new BorderLayout());

      this.img = new ImageIcon("../img/Coupe.png");
      JLabel background = new JLabel(this.img);
      
      this.button = new JButton("Retour a l'accueil");

      this.add(this.button,BorderLayout.SOUTH);
      this.add(background,BorderLayout.CENTER);
    }
}
