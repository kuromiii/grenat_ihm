package view;

import java.awt.*;
import javax.swing.*;

import controller.AppearanceListener;

public class AppearanceFrame extends JPanel {

  private TopBar topBar;
  private JButton defaultAppearance;
  private JButton lightThemeAppearance;
  private JButton darkThemeAppearance;

    /**
     * AppearanceFrame constructor.
     * Initializes components.
     * @param topBar the TopBar of the application
     */
    public AppearanceFrame(TopBar topBar) {
      if (topBar != null) {
        this.topBar = topBar;
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
      this.setLayout(new GridLayout(5,3));

      this.defaultAppearance = new JButton ("Grenat Theme");
      this.lightThemeAppearance = new JButton("Light Theme");
      this.darkThemeAppearance = new JButton("Dark Theme");

      this.add(new JPanel());
      this.add(this.defaultAppearance);
      this.add(new JPanel());
      this.add(new JPanel());
      this.add(new JPanel());
      this.add(new JPanel());
      this.add(new JPanel());
      this.add(this.lightThemeAppearance);
      this.add(new JPanel());
      this.add(new JPanel());
      this.add(new JPanel());
      this.add(new JPanel());
      this.add(new JPanel());
      this.add(this.darkThemeAppearance);
      this.add(new JPanel());

      this.defaultAppearance.addActionListener(new AppearanceListener(this.topBar,new Color(173, 20, 87)));
      this.lightThemeAppearance.addActionListener(new AppearanceListener(this.topBar,new Color(255,255,255)));
      this.darkThemeAppearance.addActionListener(new AppearanceListener(this.topBar,new Color(0,0,0)));
    }
}
