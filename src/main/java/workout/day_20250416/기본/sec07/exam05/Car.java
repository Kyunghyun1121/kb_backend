package workout.day_20250416.기본.sec07.exam05;

public class Car {

  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

  public Car() {
    color = "";
    maxSpeed = 0;
  }

  public Car(String model) {
    this();
    this.model = model;
  }
  public Car(String model, String color) {
    this(model);
    this.color = color;
    maxSpeed = 0;
  }
  public Car(String model, String color, int maxSpeed) {
    this(model, color);
    this.maxSpeed = maxSpeed;
  }


}
