package view;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

import controller.CheckboxListener;

public class ChecklistFrameMetro extends JPanel {
  ArrayList<Checkbox> chkList;

  public ChecklistFrameMetro() {
    this.chkList = new ArrayList<Checkbox>();
    this.initComponents();
  }

  public void initComponents() {
    this.setLayout(new BorderLayout());
    CheckboxListener chkListener = new CheckboxListener(this.getCheckBoxList());

    JPanel main = new JPanel(new GridLayout(5,1));

    this.chkList.add(new Checkbox("Acheter un ticket de metro a la machine", false));
    this.chkList.add(new Checkbox("Composter le billet", false));
    this.chkList.add(new Checkbox("Rentrer dans le metro", false));
    this.chkList.add(new Checkbox("Lorsque notre station est annoncee, se preparer a sortir", false));
    this.chkList.add(new Checkbox("Sortir du metro et de la station en suivant les indications", false));

    for (Checkbox chk : this.chkList) {
      chk.setForeground(Color.RED);
      chk.addItemListener(chkListener);
      main.add(chk);
    }

    for (int i = 1; i < this.chkList.size(); i++) {
      chkList.get(i).setVisible(false);
    }

    this.add(main);
  }

  public ArrayList<Checkbox> getCheckBoxList() {
    return this.chkList;
  }
}
