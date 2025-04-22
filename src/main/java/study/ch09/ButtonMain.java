package study.ch09;

import javax.swing.SwingUtilities;

public class ButtonMain {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new ButtonExample().setVisible(true);
      }
    });
  }

}
