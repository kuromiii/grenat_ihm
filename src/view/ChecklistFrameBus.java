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
    JPanel main = new JPanel(new BorderLayout());
    ck1 = new Checkbox("Rentrer dans le bus par l'avant", false);
    ck2 = new Checkbox("Prendre un ticket de bus aupres du conducteur", false);
    ck3 = new Checkbox("Valider le ticket dans la machine", false);
    ck4 = new Checkbox("Descendre du bus par l'arriere lorsque l'arret a ete atteint", false);

  }
}
