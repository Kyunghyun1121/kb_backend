package workout.day_20250507.기본.sec04;

public class LambdaExample {

  public static void main(String[] args) {
    Person person = new Person();

    person.action((x, y) -> {
      double result = x + y;
      return result;
    });

    person.action((x, y)-> sum(x, y));
  }

  public static double sum(double x, double y) {
    return (x + y);
  }
}
