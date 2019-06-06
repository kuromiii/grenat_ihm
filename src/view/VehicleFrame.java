package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class VehicleFrame extends JPanel {
  private MainFrame parent;

  private JButton boutonBus, boutonMetro, boutonTrain;
  private JButton boutonBusTexte, boutonMetroTexte, boutonTrainTexte;
  private final Color COLOR = new Color(0xFBE8E8);

  /**
    *Creates a new VehicleFrame object
    */
    public VehicleFrame(MainFrame parent) {
      if (parent != null) {
        this.parent = parent;
        initComponent();
      }
    }

  /**
    *Initializes the components
    */
    private void initComponent() {
      VehicleButtonListener vehiListener = new VehicleButtonListener(this.parent, this);

      this.boutonBus = new JButton();
      this.boutonBus.addActionListener(vehiListener);
      this.boutonMetro = new JButton();
      this.boutonMetro.addActionListener(vehiListener);
      this.boutonTrain = new JButton();
      this.boutonTrain.addActionListener(vehiListener);

      this.boutonBusTexte = new JButton("Bus");
      this.boutonMetroTexte = new JButton ("Metro");
      this.boutonTrainTexte = new JButton("Train");

      this.boutonBusTexte.addActionListener(vehiListener);
      this.boutonMetroTexte.addActionListener(vehiListener);
      this.boutonTrainTexte.addActionListener(vehiListener);

      this.boutonBus.setBackground(this.COLOR);
      this.boutonBusTexte.setBackground(this.COLOR);
      this.boutonMetro.setBackground(this.COLOR);
      this.boutonMetroTexte.setBackground(this.COLOR);
      this.boutonTrain.setBackground(this.COLOR);
      this.boutonTrainTexte.setBackground(this.COLOR);




      Image img = (new ImageIcon("../img/Bus.png")).getImage();
      Image newImg = img.getScaledInstance(120,120,Image.SCALE_SMOOTH);
      this.boutonBus.setIcon(new ImageIcon(newImg));
      Image img2 = (new ImageIcon("../img/Metro.png")).getImage();
      Image newImg2 = img2.getScaledInstance(120,120,Image.SCALE_SMOOTH);
      this.boutonMetro.setIcon(new ImageIcon(newImg2));
      Image img3 = (new ImageIcon("../img/Train.png")).getImage();
      Image newImg3 = img3.getScaledInstance(120,120,Image.SCALE_SMOOTH);
      this.boutonTrain.setIcon(new ImageIcon(newImg3));

      this.setLayout(new BorderLayout());

      JPanel centralPanel = new JPanel(new GridLayout(1,5));
      JPanel bus = new JPanel(new BorderLayout());
      bus.add(this.boutonBus,BorderLayout.CENTER);
      bus.add(this.boutonBusTexte,BorderLayout.SOUTH);

      JPanel busContainer = new JPanel(new GridLayout(3,1));
      busContainer.add(new JPanel());
      busContainer.add(bus);
      busContainer.add(new JPanel());
      centralPanel.add(busContainer);
      centralPanel.add(new JLabel(""));

      JPanel metro = new JPanel(new BorderLayout());
      metro.add(this.boutonMetro,BorderLayout.CENTER);
      metro.add(this.boutonMetroTexte,BorderLayout.SOUTH);

      JPanel metroContainer = new JPanel(new GridLayout(3,1));
      metroContainer.add(new JPanel());
      metroContainer.add(metro);
      metroContainer.add(new JPanel());
      centralPanel.add(metroContainer);
      centralPanel.add(new JLabel(""));

      JPanel train = new JPanel (new BorderLayout());
      train.add(this.boutonTrain,BorderLayout.CENTER);
      train.add(this.boutonTrainTexte,BorderLayout.SOUTH);

      JPanel trainContainer = new JPanel(new GridLayout(3,1));
      trainContainer.add(new JPanel());
      trainContainer.add(train);
      trainContainer.add(new JPanel());
      centralPanel.add(trainContainer);

      JPanel centralContainer = new JPanel(new BorderLayout());
      centralContainer.add(new JLabel(" "),BorderLayout.WEST);
      centralContainer.add(new JLabel(" "),BorderLayout.EAST);
      centralContainer.add(centralPanel,BorderLayout.CENTER);
      add(centralContainer,BorderLayout.CENTER);
    }

    public JButton getBusButton() {
      return this.boutonBus;
    }

    public JButton getMetroButton() {
      return this.boutonMetro;
    }

    public JButton getTrainButton() {
      return this.boutonTrain;
    }
}
