package view;
import java.awt.*;
import javax.swing.*;

import controller.*;

public class VictoryScreen extends JPanel {
  private MainFrame parent;

  private JButton button;

    /**
     * VictoryScreen constructor.
     * Checks if parent is valid, throws an error otherwise.
     * Then, initializes components.
     * @param parent the parent frame, needed by the GoBackHomeButtonListener
     */
    public VictoryScreen(MainFrame parent) {
      if (parent != null) {
          this.parent = parent;
          this.initComponents();
      } else {
          throw new NullPointerException();
      }
    }

    /**
     * Initializes components of the panel.
     */
    public void initComponents() {
      this.setLayout(new BorderLayout());

      Image cupImg = (new ImageIcon("../img/Coupe.png")).getImage();
      Image rescaledCupImg = cupImg.getScaledInstance(300, 450, Image.SCALE_SMOOTH);

      JLabel background = new JLabel(new ImageIcon(rescaledCupImg));

      this.button = new JButton("Retour a l'accueil");
      this.button.addActionListener(new GoBackHomeButtonListener(this.parent));

      this.add(this.button, BorderLayout.SOUTH);
      this.add(background, BorderLayout.CENTER);
    }
}
