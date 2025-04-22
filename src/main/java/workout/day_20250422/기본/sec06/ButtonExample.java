package workout.day_20250422.기본.sec06;

import workout.day_20250422.기본.sec06.Button.ClickListener;

public class ButtonExample {

  public static void main(String[] args) {
    Button b = new Button();
    class ButtonListener implements ClickListener {
      @Override
      public void onClick() {
        System.out.println("onClick");
      }
    }


  }

}
