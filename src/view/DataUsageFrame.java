package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class DataUsageFrame extends JPanel {

  private JButton button;
  private JLabel wifiLabel;

    /**
     * DataUsageFrame constructor.
     * Initializes components.
     * @param wifiLabel the wifi label to use
     */
    public DataUsageFrame(JLabel wifiLabel) {
      if (wifiLabel != null) {
        this.wifiLabel = wifiLabel;
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

      this.button = new JButton("Show wifi");

      JPanel container = new JPanel(new GridLayout(3,3));

      for (int i = 0 ; i < 5 ; i++) {
        container.add(new JLabel());
      }
      container.add(this.button);
      for (int i = 0 ; i < 5 ; i++) {
        container.add(new JLabel());
      }

      this.add(container,BorderLayout.CENTER);

      this.button.addActionListener(new IconShowListener(this.wifiLabel));

    }
}
