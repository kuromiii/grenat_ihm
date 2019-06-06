package view;

import java.awt.*;
import javax.swing.*;

public class CalenderFrame extends JPanel {

  private JButton addTrajet;
  private JPanel Calendar;

  public CalenderFrame() {
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
    addTrajet = new JButton("Ajouter un trajet");

  }
}
