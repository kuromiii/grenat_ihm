package view;

import java.awt.*;
import javax.swing.*;

import controller.*;

public class VehicleFrame extends JPanel {
  private MainFrame parent;

  private JButton busBtn, metroBtn, trainBtn;
  private JButton busTextBtn, metroTextBtn, trainTextBtn;
  
  private final Color BUTTON_COLOR = new Color(251, 232, 232);

  /**
    *Creates a new VehicleFrame object
    */
    public VehicleFrame(MainFrame parent) {
      if (parent != null) {
        this.parent = parent;
        this.initComponent();
      } else {
        throw new NullPointerException();
      }
    }

  /**
    *Initializes the components
    */
    private void initComponent() {
      VehicleButtonListener vehiListener = new VehicleButtonListener(this.parent, this);

      Image busImg = (new ImageIcon("../img/Bus.png")).getImage();
      Image rescaledBusImg = busImg.getScaledInstance(120,120,Image.SCALE_SMOOTH);

      Image metroImg = (new ImageIcon("../img/Metro.png")).getImage();
      Image rescaledMetroImg = metroImg.getScaledInstance(120,120,Image.SCALE_SMOOTH);

      Image trainImg = (new ImageIcon("../img/Train.png")).getImage();
      Image rescaledTrainImg = trainImg.getScaledInstance(120,120,Image.SCALE_SMOOTH);

      this.busBtn = new JButton();
      this.busBtn.setBackground(this.BUTTON_COLOR);
      this.busBtn.addActionListener(vehiListener);
      this.busBtn.setIcon(new ImageIcon(rescaledBusImg));

      this.metroBtn = new JButton();
      this.metroBtn.setBackground(this.BUTTON_COLOR);
      this.metroBtn.addActionListener(vehiListener);
      this.metroBtn.setIcon(new ImageIcon(rescaledMetroImg));

      this.trainBtn = new JButton();
      this.trainBtn.setBackground(this.BUTTON_COLOR);
      this.trainBtn.addActionListener(vehiListener);
      this.trainBtn.setIcon(new ImageIcon(rescaledTrainImg));

      this.busTextBtn = new JButton("Bus");
      this.busTextBtn.setBackground(this.BUTTON_COLOR);
      this.busTextBtn.addActionListener(vehiListener);

      this.metroTextBtn = new JButton ("Metro");
      this.metroTextBtn.setBackground(this.BUTTON_COLOR);
      this.metroTextBtn.addActionListener(vehiListener);

      this.trainTextBtn = new JButton("Train");
      this.trainTextBtn.setBackground(this.BUTTON_COLOR);
      this.trainTextBtn.addActionListener(vehiListener);

      this.setLayout(new BorderLayout());

      JPanel centralPanel = new JPanel(new GridLayout(1,5));
      JPanel bus = new JPanel(new BorderLayout());
      bus.add(this.busBtn,BorderLayout.CENTER);
      bus.add(this.busTextBtn,BorderLayout.SOUTH);

      JPanel busContainer = new JPanel(new GridLayout(3,1));
      busContainer.add(new JPanel());
      busContainer.add(bus);
      busContainer.add(new JPanel());
      centralPanel.add(busContainer);
      centralPanel.add(new JLabel(""));

      JPanel metro = new JPanel(new BorderLayout());
      metro.add(this.metroBtn,BorderLayout.CENTER);
      metro.add(this.metroTextBtn,BorderLayout.SOUTH);

      JPanel metroContainer = new JPanel(new GridLayout(3,1));
      metroContainer.add(new JPanel());
      metroContainer.add(metro);
      metroContainer.add(new JPanel());
      centralPanel.add(metroContainer);
      centralPanel.add(new JLabel(""));

      JPanel train = new JPanel (new BorderLayout());
      train.add(this.trainBtn,BorderLayout.CENTER);
      train.add(this.trainTextBtn,BorderLayout.SOUTH);

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
      return this.busBtn;
    }

    public JButton getMetroButton() {
      return this.metroBtn;
    }

    public JButton getTrainButton() {
      return this.trainBtn;
    }
}
