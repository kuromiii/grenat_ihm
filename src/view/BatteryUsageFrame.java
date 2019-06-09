package view;

import java.awt.*;
import javax.swing.*;

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

      JPanel container = new JPanel(new GridLayout(1,3));
      container.add(new JPanel());
      container.add(this.button);
      container.add(new JPanel());

      this.add(container,BorderLayout.CENTER);

    }
}
