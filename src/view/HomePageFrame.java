package view;
import java.awt.*;
import javax.swing.*;
import controller.*;

public class HomePageFrame extends JPanel {
  private JButton boutonLogo;

  public HomePageFrame() {
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
    this.boutonLogo = new JButton();

    Image logo = (new ImageIcon("../img/Logo.png")).getImage();
    Image newLogo = logo.getScaledInstance(500,500,Image.SCALE_SMOOTH);
    this.boutonLogo.setIcon(new ImageIcon(newLogo));

    boutonLogo.setOpaque(false);
    boutonLogo.setContentAreaFilled(false);
    boutonLogo.setBorderPainted(false);

    setLayout(new BorderLayout());
    add(boutonLogo);

  }
}
