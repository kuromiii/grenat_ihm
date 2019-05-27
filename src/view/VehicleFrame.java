package view;
import java.awt.*;
import javax.swing.*;

public class VehicleFrame extends JPanel {


  public VehicleFrame() {
    JTextField msg = new JTextField("Bonjour\nQuel moyen de transport voulez-vous utiliser aujourd'hui ?");
    JPanel buttons = new JPanel();

    JButton bus = new JButton(new ImageIcon("../img/Bus.png"));
    JButton metro = new JButton(new ImageIcon("../img/Metro.png"));
    JButton train = new JButton(new ImageIcon("../img/Train.png"));

  }
}
