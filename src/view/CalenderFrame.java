package view;

import java.awt.*;
import javax.swing.*;
import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.TimeZone;

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
    calendrier = new JPanel(new GridLayout(11,8));
    setLayout(new BorderLayout());

    JPanel down = new JPanel(new GridLayout(1,3));
    down.add(new JLabel());
    down.add(new JLabel());
    down.add(addTrajet);

    JPanel up = new JPanel (new GridLayout(1,8));
    TimeZone timeZone = TimeZone.getTimeZone("Europe/Paris");
    LocalDate today = LacalDate.now();
    LocalDate monday = today.minusDays(today.getDayOfWeek().getValue()-1);
    Instant instant = monday.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
    Date date = Date.from(instant);
    cal = new GregorianCalendar(timeZone);
    cal.setTime(date);
    String dayString = dayFormat.format(date);
    String[] dayArray = new String[7];
        for (int i = 0; i < 6; i++) {
            calendar.add(Calendar.DATE, i);
            date = calendar.getTime();
            System.out.println ("getDates - date=" + date);
            dayString = dayFormat.format(date);
            System.out.println("getDates - dayString=" + dayString);
        }
  }
}
