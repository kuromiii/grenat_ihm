package view;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

import controller.CheckboxListener;

public class ChecklistFrameTrain extends JPanel {
  // An ArrayList containing the Checkboxes
  ArrayList<Checkbox> chkList;
  // The main frame of the application
  MainFrame parent;

  /**
   * ChecklistFrameTrain constructor.
   * Creates and Initializes an empty ArrayList, then initializes the components.
   * @param parent the parent frame, needed by the CheckboxListener
   */
  public ChecklistFrameTrain(MainFrame parent) {
    if (parent != null) {
      this.parent = parent;
      this.chkList = new ArrayList<Checkbox>();
      this.initComponents();
    }
    else {
      throw new NullPointerException();
    }

  }

  /**
   * Initializes components of the Panel.
   */
  public void initComponents() {
    this.setLayout(new BorderLayout());

    CheckboxListener chkListener = new CheckboxListener(this.getCheckBoxList(), this.parent);
    JPanel main = new JPanel(new GridLayout(this.chkList.size(), 1));

    this.chkList.add(new Checkbox("Sortir le ticket du sac et le composter", false));
    this.chkList.add(new Checkbox("Rentrer dans le wagon correspondant au ticket", false));
    this.chkList.add(new Checkbox("Trouver sa place a l'aide du ticket", false));
    this.chkList.add(new Checkbox("Ranger ses bagages au dessus de sa place", false));
    this.chkList.add(new Checkbox("Si un controleur se presente, lui montrer son ticket", false));
    this.chkList.add(new Checkbox("Lorsque notre gare est annoncee: reprendre ses affaires et se diriger vers la sortie", false));
    this.chkList.add(new Checkbox("Sortir du train lorsque celui-ci est a l'arret et se rendre vers la sortie de la gare", false));

    // For each Checkbox, we set its text color to red, attach it the CheckboxListener,
    // and add it to the panel
    for (Checkbox chk : this.chkList) {
      chk.setForeground(Color.RED);
      chk.addItemListener(chkListener);
      main.add(chk);
    }

    // We hide every Checkbox besides the first one
    for (int i = 1; i < this.chkList.size(); i++) {
      chkList.get(i).setVisible(false);
    }

    this.add(main);
  }

  /**
   * Return an ArrayList containing every Checkbox, in order.
   * @return an ArrayList containing every Checkbox
   */
  public ArrayList<Checkbox> getCheckBoxList() {
    return this.chkList;
  }
}
