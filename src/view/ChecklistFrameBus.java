package view;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

import controller.*;

public class ChecklistFrameBus extends JPanel {
  // An ArrayList containing the Checkboxes
  ArrayList<Checkbox> chkList;
  // The main frame of the application
  MainFrame parent;

  /**
   * ChecklistFrameBus constructor.
   * Creates and Initializes an empty ArrayList, then initializes the components.
   * @param parent the parent frame, needed by the CheckboxListener
   */
  public ChecklistFrameBus(MainFrame parent) {
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
   * Initializes the components.
   */
  public void initComponents() {
    this.setLayout(new BorderLayout());

    CheckboxListener chkListener = new CheckboxListener(this.getCheckBoxList(), this.parent);
    JPanel main = new JPanel(new GridLayout(this.chkList.size(), 1));

    this.chkList.add(new Checkbox("Rentrer dans le bus par l'avant", false));
    this.chkList.add(new Checkbox("Prendre un ticket de bus aupres du conducteur", false));
    this.chkList.add(new Checkbox("Valider le ticket dans la machine", false));
    this.chkList.add(new Checkbox("Descendre du bus par l'arriere lorsque l'arret a ete atteint", false));

    // For each Checkbox except the last one, we set its text color to red, attach it the CheckboxListener,
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
