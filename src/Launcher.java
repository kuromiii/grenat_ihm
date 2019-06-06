import java.awt.*;

import view.*;

public class Launcher {
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        MainFrame gui = new MainFrame();
      }
    });
  }
}
