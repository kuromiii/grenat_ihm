package view;

import java.awt.*;
import javax.swing.*;
import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CalenderFrame extends JPanel {

  private JButton addTrajet;
  private JPanel calendrier;
  private GregorianCalendar cal;

  // Colors of calendar entries, depending on the type of transport
  private static final Color TRAIN_COLOR = new Color(240, 59, 105);
  private static final Color BUS_COLOR = new Color(244, 122, 84);
  private static final Color METRO_COLOR = new Color(243, 94, 152);
  private static final Color CAR_COLOR = new Color(247, 146, 181);

  /**
   * CalenderFrame constructor.
   * Initializes components.
   */
  public CalenderFrame() {
    this.initComponents();
  }

  /**
   * Initializes components of the Panel.
   */
  public void initComponents() {
    addTrajet = new JButton("Ajouter un trajet");
    calendrier = new JPanel(new GridLayout(11,8));
    setLayout(new BorderLayout());

    JPanel down = new JPanel(new GridLayout(1,3));
    down.add(new JLabel());
    down.add(new JLabel());
    down.add(addTrajet);
    add(down,BorderLayout.SOUTH);

    JPanel up = new JPanel (new GridLayout(1,8));
    up.add(new JPanel());

    String[] dayName = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
    TimeZone timeZone = TimeZone.getTimeZone("Europe/Paris");
    SimpleDateFormat dayFormat = new SimpleDateFormat("dd-MM-yyyy");
    LocalDate today = LocalDate.now();
    LocalDate monday = today.minusDays(today.getDayOfWeek().getValue()-1);
    Instant instant = monday.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
    Date date = Date.from(instant);
    cal = new GregorianCalendar(timeZone);
    cal.setTime(date);
    String dayString = dayFormat.format(date);
    int numero = cal.get(Calendar.DAY_OF_MONTH);
    up.add(new JLabel(dayName[0] + " " + numero));
    for (int i = 1 ; i < 7 ; i++) {
      numero += 1;
      up.add(new JLabel(dayName[i] + " " + numero));
    }
    add(up,BorderLayout.NORTH);

    calendrier.add(new JLabel("9:00"));
    JPanel p = new JPanel(new BorderLayout());
    p.add(new JLabel("Train pour Paris"));
    p.setBackground(CalenderFrame.TRAIN_COLOR);
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("En voiture chez mamie"));
    p.setBackground(CalenderFrame.CAR_COLOR);
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    calendrier.add(new JLabel("10:00"));
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("Train pour Paris"));
    p.setBackground(CalenderFrame.TRAIN_COLOR);
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("Bus vers la mairie"));
    p.setBackground(CalenderFrame.BUS_COLOR);
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("Bus vers Carrefour"));
    p.setBackground(CalenderFrame.BUS_COLOR);
    calendrier.add(p);
    calendrier.add(new JLabel("11:00"));
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("Metro ligne 11"));
    p.setBackground(CalenderFrame.METRO_COLOR);
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("Bus vers le bowling"));
    p.setBackground(CalenderFrame.BUS_COLOR);
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    calendrier.add(new JLabel("12:00"));
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p.add(new JLabel("Bus vers chez JP"));
    p.setBackground(CalenderFrame.BUS_COLOR);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("Bus vers la maison"));
    p.setBackground(CalenderFrame.BUS_COLOR);
    calendrier.add(p);
    calendrier.add(new JLabel("13:00"));
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    calendrier.add(new JLabel("14:00"));
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("Bus de 14h"));
    p.setBackground(CalenderFrame.BUS_COLOR);
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("Train vers la maison"));
    p.setBackground(CalenderFrame.TRAIN_COLOR);
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    calendrier.add(new JLabel("15:00"));
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("Train vers la maison"));
    p.setBackground(CalenderFrame.TRAIN_COLOR);
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    calendrier.add(new JLabel("16:00"));
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    p.add(new JLabel("Bus vers la maison"));
    p.setBackground(CalenderFrame.BUS_COLOR);
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    calendrier.add(new JLabel("17:00"));
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    calendrier.add(new JLabel("18:00"));
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    calendrier.add(new JLabel("19:00"));
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);
    p = new JPanel(new BorderLayout());
    calendrier.add(p);

    add(calendrier,BorderLayout.CENTER);
  }
}
