package view;

import java.awt.*;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class CalenderFrame extends JPanel {

  private JButton addTrajet;
  private JPanel calendrier;
  private GregorianCalendar cal;

  public CalenderFrame() {
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
    addTrajet = new JButton("Ajouter un trajet");
    calendrier = new JPanel(new GridLayout(11,8))
    cal = new GregorianCalendar();
    setLayout(new BorderLayout());

    JPanel down = new JPanel(new GridLayout(1,3));
    down.add(new JLabel());
    down.add(new JLabel());
    down.add(addTrajet);

    JPanel up = new JPanel (new GridLayout(1,8));
    int week = cal.get(Calendar.WEEK_OF_YEAR);


  }
}
