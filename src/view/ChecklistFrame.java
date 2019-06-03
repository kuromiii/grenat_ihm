package view;

import java.awt.*;
import javax.swing.*;

public class ChecklistFrame extends JPanel {

  public ChecklistFrame() {
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

  }
}
