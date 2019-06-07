package view;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

import controller.CheckboxListener;

public class ChecklistFrameMetro extends JPanel {
  // An ArrayList containing the Checkboxes
  ArrayList<Checkbox> chkList;
  // The main frame of the application
  MainFrame parent;

  /**
   * ChecklistFrameMetro constructor.
   * Creates and Initializes an empty ArrayList, then initializes the components.
   * @param parent the parent frame, needed by the CheckboxListener
   */
  public ChecklistFrameMetro(MainFrame parent) {
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
