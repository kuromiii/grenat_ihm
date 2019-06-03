package view;

import java.awt.*;
import javax.swing.*;

public class SettingsFrame extends JPanel {

  public SettingsFrame() {
    try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
    catch (ReflectiveOperationException e) {
      e.printStackTrace();
    }

    initComponents();
  }

  public void initComponents() {
    JPanel main = new JPanel(new BorderLayout());

    String[] settings = {"Apparence", "Accessibilite", "Notifications",
     "Utilisation de la betterie", "Utilisation du reseau"};
    JList<String> list = new JList<String>(settings);
    main.add(list, BorderLayout.WEST);
    this.add(main);
  }
}
