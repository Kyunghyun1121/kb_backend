package workout.day_20250416.기본.sec14;

public class Car {

  private int speed;
  private boolean stop;

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
    } else {
      this.speed = speed;
    }
  }

  public void print() {
    System.out.println("현재 속도:" + speed);
  }

  public boolean isStop() {
    return stop;
  }

  public void setStop(boolean stop) {
    this.stop = stop;
    if (stop) {
      speed = 0;
    }
  }
}
