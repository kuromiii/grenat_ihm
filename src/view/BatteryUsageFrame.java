package view;

import java.awt.*;
import javax.swing.*;

import controller.IconShowListener;

public class BatteryUsageFrame extends JPanel {

  private JButton button;
  private JLabel batteryLabel;

    /**
     * BatteryUsageFrame constructor.
     * Initializes components.
     * @param battery the battery image to use
     */
    public BatteryUsageFrame(JLabel batteryLabel) {
      if (batteryLabel != null) {
        this.batteryLabel = batteryLabel;
        this.initComponents();
      }
      else {
        throw new NullPointerException();
      }
    }

    /**
     * Initializes components of the panel.
     */
    public void initComponents() {
      this.setLayout(new BorderLayout());

      this.button = new JButton("Show battery use");

      JPanel container = new JPanel(new GridLayout(3,3));

      for (int i = 0 ; i < 5 ; i++) {
        container.add(new JLabel());
      }
      container.add(this.button);
      for (int i = 0 ; i < 5 ; i++) {
        container.add(new JLabel());
      }

      this.add(container,BorderLayout.CENTER);

      this.button.addActionListener(new IconShowListener(this.batteryLabel));

    }
}
