package view;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

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
    ck1 = new Checkbox("Sortir le ticket du sac et le composter", false);
    ck2 = new Checkbox("Rentrer dans le wagon correspondant au ticket", false);
    ck3 = new Checkbox("Trouver sa place a l'aide du ticket", false);
    ck4 = new Checkbox("Ranger ses bagages au dessus de sa place", false);
    ck5 = new Checkbox("Si un controleur se presente, lui montrer son ticket", false);
    ck6 = new Checkbox("Lorsque notre gare est annoncee: reprendre ses affaires et se diriger vers la sortie", false);
    ck7 = new Checkbox("Sortir du train lorsque celui-ci est a l'arret et se rendre vers la sortie de la gare", false);

    ck2.setVisible(false);
    ck3.setVisible(false);
    ck4.setVisible(false);
    ck5.setVisible(false);
    ck6.setVisible(false);
    ck7.setVisible(false);

    ck1.setForeground(Color.RED);
    ck2.setForeground(Color.RED);
    ck3.setForeground(Color.RED);
    ck4.setForeground(Color.RED);
    ck5.setForeground(Color.RED);
    ck6.setForeground(Color.RED);
    ck7.setForeground(Color.RED);


    setLayout(new BorderLayout());
    JPanel main = new JPanel(new GridLayout(7,1));

    main.add(ck1);
    main.add(ck2);
    main.add(ck3);
    main.add(ck4);
    main.add(ck5);
    main.add(ck6);
    main.add(ck7);

    add(main);

    this.setActrionListener(new CheckboxListener(this.getListeCheckBox()));
  }


  public ArrayList<Checkbox> getListeCheckBox() {
    ArrayList<Checkbox> ret = new ArrayList<Checkbox>();

    ret.add(this.ck1);
    ret.add(this.ck4);
    ret.add(this.ck3);
    ret.add(this.ck4);
    ret.add(this.ck5);
    ret.add(this.ck6);
    ret.add(this.ck7);

    return ret;
  }
}
