package view;

import java.awt.*;
import javax.swing.*;

public class ChecklistFrameMetro extends JPanel {
  private Checkbox ck1;
  private Checkbox ck2;
  private Checkbox ck3;
  private Checkbox ck4;
  private Checkbox ck5;

  public ChecklistFrameMetro() {
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
    ck1 = new Checkbox("Acheter un ticket de metro a la machine", false);
    ck2 = new Checkbox("Composter le billet", false);
    ck3 = new Checkbox("Rentrer dans le metro", false);
    ck4 = new Checkbox("Lorsque notre station est annoncee, se preparer a sortir", false);
    ck5 = new Checkbox("Sortir du metro et de la station en suivant les indications", false);

    ck2.setVisible(false);
    ck3.setVisible(false);
    ck4.setVisible(false);
    ck5.setVisible(false);

    ck1.setForeground(Color.RED);
    ck2.setForeground(Color.RED);
    ck3.setForeground(Color.RED);
    ck4.setForeground(Color.RED);
    ck5.setForeground(Color.RED);

    setLayout(new BorderLayout());
    JPanel main = new JPanel(new GridLayout(5,1));

    main.add(ck1);
    main.add(ck2);
    main.add(ck3);
    main.add(ck4);
    main.add(ck5);

    add(main);
  }
}
