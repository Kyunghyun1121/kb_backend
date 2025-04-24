package workout.day_20250424.기본;

import java.awt.Toolkit;

public class BeepPrintExampleRunnable {

  public static void main(String[] args) {
    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
          toolkit.beep();
          System.out.println("beep");
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      }
    });
    t.start();

    for (int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }


}
