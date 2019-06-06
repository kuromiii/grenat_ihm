package view;

import java.awt.*;
import javax.swing.*;

public class SettingsFrame extends JPanel {

  public SettingsFrame() {
    this.initComponents();
  }

  public void initComponents() {

    String[] settings = {"Apparence", "Accessibilite", "Notifications",
     "Utilisation de la batterie", "Utilisation du reseau"};
    JList<String> list = new JList<String>(settings);
    
    this.setLayout(new BorderLayout());
    this.add(list,BorderLayout.WEST);
  }
}
