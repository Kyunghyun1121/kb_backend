package workout.day_20250416.기본.sec10.exam01;

public class CaculatorExample {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    double result1 = 10 * 10 * calculator.pi;
    double result2 = calculator.plus(10, 5);
    double result3 = calculator.minus(10, 5);

    System.out.println("result1 : " + result1);
    System.out.println("result2 : " + result2);
    System.out.println("result3 : " + result3);
  }
}
