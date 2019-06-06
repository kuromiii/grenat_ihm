package view;

import java.awt.*;
import javax.swing.*;

public class ChecklistFrameBus extends JPanel {
  private Checkbox ck1;
  private Checkbox ck2;
  private Checkbox ck3;
  private Checkbox ck4;

  public ChecklistFrameBus() {
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
    ck1 = new Checkbox("Rentrer dans le bus par l'avant", false);
    ck2 = new Checkbox("Prendre un ticket de bus aupres du conducteur", false);
    ck3 = new Checkbox("Valider le ticket dans la machine", false);
    ck4 = new Checkbox("Descendre du bus par l'arriere lorsque l'arret a ete atteint", false);

    ck2.setVisible(false);
    ck3.setVisible(false);
    ck4.setVisible(false);

    ck1.setForeground(Color.RED);
    ck2.setForeground(Color.RED);
    ck3.setForeground(Color.RED);
    ck4.setForeground(Color.RED);

    setLayout(new BorderLayout());
    JPanel main = new JPanel(new GridLayout(4,1));

    main.add(ck1);
    main.add(ck2);
    main.add(ck3);
    main.add(ck4);

    add(main);
  }
}
