package workout.day_20250415.기본.ch04.sec04;

public class SumFrom1To100Example {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    System.out.print("1~100 합 : " + sum);
  }
}
