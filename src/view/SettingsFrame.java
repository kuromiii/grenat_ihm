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

  }
}
