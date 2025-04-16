package workout.day_20250416.기본.sec07.exam04;

public class Car {
  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

  public Car() {
    model = "";
    color = "";
    maxSpeed = 0;
  }
  public Car(String model) {
    this.model = model;
    color = "";
    maxSpeed = 0;
  }
  public Car(String model, String color) {
    this.model = model;
    this.color = color;
    maxSpeed = 0;
  }
  public Car(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }


}
