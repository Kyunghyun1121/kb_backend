package workout.day_20250429.기본.sec02.exam02;

public class CarAgency implements Rentable{

  @Override
  public Car rent() {
    return new Car();
  }
}
