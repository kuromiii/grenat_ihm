package view;
import java.awt.*;
import javax.swing.*;

public class VehicleFrame extends JPanel {

  private JButton boutonBus;
  private JButton boutonMetro;
  private JButton boutonTrain;
  private JButton boutonBusTexte;
  private JButton boutonMetroTexte;
  private JButton boutonTrainTexte;

  /**
    *Creates a new VehicleFrame object
    */
    public VehicleFrame() {
      initComponent();
    }

  /**
    *Initializes the components
    */
    private void initComponent() {
      boutonBus = new JButton();
      boutonMetro = new JButton();
      boutonTrain = new JButton();
      boutonBusTexte = new JButton("Bus");
      boutonMetroTexte = new JButton ("Metro");
      boutonTrainTexte = new JButton("Train");


      Image img = (new ImageIcon("../img/Bus.png")).getImage();
      Image newImg = img.getScaledInstance(120,120,Image.SCALE_SMOOTH);
      boutonBus.setIcon(new ImageIcon(newImg));
      Image img2 = (new ImageIcon("../img/Metro.png")).getImage();
      Image newImg2 = img2.getScaledInstance(120,120,Image.SCALE_SMOOTH);
      boutonMetro.setIcon(new ImageIcon(newImg2));
      Image img3 = (new ImageIcon("../img/Train.png")).getImage();
      Image newImg3 = img3.getScaledInstance(120,120,Image.SCALE_SMOOTH);
      boutonTrain.setIcon(new ImageIcon(newImg3));



      setLayout(new BorderLayout());

      JPanel centralPanel = new JPanel(new GridLayout(1,5));
      JPanel bus = new JPanel(new BorderLayout());
      bus.add(boutonBus,BorderLayout.CENTER);
      bus.add(boutonBusTexte,BorderLayout.SOUTH);

      JPanel busContainer = new JPanel(new GridLayout(3,1));
      busContainer.add(new JPanel());
      busContainer.add(bus);
      busContainer.add(new JPanel());
      centralPanel.add(busContainer);
      centralPanel.add(new JLabel(""));

      JPanel metro = new JPanel(new BorderLayout());
      metro.add(boutonMetro,BorderLayout.CENTER);
      metro.add(boutonMetroTexte,BorderLayout.SOUTH);
      JPanel metroContainer = new JPanel(new GridLayout(3,1));
      metroContainer.add(new JPanel());
      metroContainer.add(metro);
      metroContainer.add(new JPanel());
      centralPanel.add(metroContainer);
      centralPanel.add(new JLabel(""));

      JPanel train = new JPanel (new BorderLayout());
      train.add(boutonTrain,BorderLayout.CENTER);
      train.add(boutonTrainTexte,BorderLayout.SOUTH);

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
}
