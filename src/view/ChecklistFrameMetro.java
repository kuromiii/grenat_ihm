package view;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

import controller.CheckboxListener;

public class ChecklistFrameMetro extends JPanel {
  // An ArrayList containing the Checkboxes
  ArrayList<Checkbox> chkList;

  /**
   * ChecklistFrameMetro constructor.
   * Creates and Initializes an empty ArrayList, then initializes the components.
   */
  public ChecklistFrameMetro() {
    this.chkList = new ArrayList<Checkbox>();
    this.initComponents();
  }

  /**
   * Initializes the components.
   */
  public void initComponents() {
    this.setLayout(new BorderLayout());
    CheckboxListener chkListener = new CheckboxListener(this.getCheckBoxList());

    JPanel main = new JPanel(new GridLayout(5,1));

    this.chkList.add(new Checkbox("Acheter un ticket de metro a la machine", false));
    this.chkList.add(new Checkbox("Composter le billet", false));
    this.chkList.add(new Checkbox("Rentrer dans le metro", false));
    this.chkList.add(new Checkbox("Lorsque notre station est annoncee, se preparer a sortir", false));
    this.chkList.add(new Checkbox("Sortir du metro et de la station en suivant les indications", false));

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
