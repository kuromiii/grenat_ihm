package view;

import java.awt.*;
import javax.swing.*;

public class SettingsFrame extends JPanel {

  public SettingsFrame() {
    initComponents();
  }

  public void initComponents() {
    JPanel main = new JPanel(new BorderLayout());

    String[] settings = {"Apparence", "Accessibilite", "Notifications",
     "Utilisation de la batterie", "Utilisation du reseau"};
    JList<String> list = new JList<String>(settings);
    main.add(list, BorderLayout.NORTH);

    this.add(new JPanel(new CardLayout()), BorderLayout.CENTER);
    this.add(main);
  }
}
