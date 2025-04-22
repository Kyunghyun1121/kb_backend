package workout.day_20250421.심화.sec11.exam02;

public class DriverExample {

  public static void main(String[] args) {
    Driver driver = new Driver();
    Bus bus = new Bus();
    Taxi taxi = new Taxi();
    driver.drive(bus);
    driver.drive(taxi);
  }
}
