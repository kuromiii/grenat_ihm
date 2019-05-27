package view;
import java.awt.*;
import javax.swing.*;

public class TopBar extends JPanel {
  ImageIcon logo;
  Jpanel barreLiens;

  public TopBar() {
    this.logo = new ImageIcon("../img/logo.png");
    this.barreLiens = new JPanel();
  }
}
