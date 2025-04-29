package workout.day_20250429.기본.sec02.exam02;

public class HomeAgency implements Rentable{

  @Override
  public Home rent() {
    return new Home();
  }
}
