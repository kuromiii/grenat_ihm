package view;

import java.awt.*;
import javax.swing.*;

public class ChecklistFrameTrain extends JPanel {
  private Checkbox ck1;
  private Checkbox ck2;
  private Checkbox ck3;
  private Checkbox ck4;
  private Checkbox ck5;
  private Checkbox ck6;
  private Checkbox ck7;

  public ChecklistFrameTrain() {
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
    ck1 = new Checkbox("Sortir le ticket du sac et le composter", false);
    ck2 = new Checkbox("Rentrer dans le wagon correspondant au ticket", false);
    ck3 = new Checkbox("Trouver sa place à l'aide du ticket", false);
    ck4 = new Checkbox("Ranger ses bagages au dessus de sa place", false);
    ck5 = new Checkbox("Si un Controleur se presente, lui montrer son ticket", false);
    ck6 = new Checkbox("Lorsque notre gare est annoncee: reprendre ses affaires et se diriger vers la sortie", false);
    ck7 = new Checkbox("Sortir du train lorsque celui-ci est à l'arret et se rendre vers la sortie de la gare", false);
  }
}
