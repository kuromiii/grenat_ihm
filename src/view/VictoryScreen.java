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
      initComponent();
    }

  /**
    *Initializes the components
    */
    public void initComponent() {
      setLayout(new BorderLayout())
      this.img = new ImageIcon("../img/Coupe.png");
      JLabel background = new JLabel(this.img);
      this.button = new JButton("Retour a l'accueil");
      add(this.button,BorderLayout.SOUTH);
      add(background,BorderLayout.CENTER);
    }
}
