package workout.day_20250421.기본.sec02;

public class RemoteControlExample {

  public static void main(String[] args) {
    RemoteControl rc;
    rc = new Television();
    rc.turnOn();

    rc = new Audio();
    rc.turnOn();
  }

}
