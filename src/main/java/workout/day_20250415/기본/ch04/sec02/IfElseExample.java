package workout.day_20250415.기본.ch04.sec02;

public class IfElseExample {

  public static void main(String[] args) {
    int score = 85;
    if (score >= 90) {
      System.out.println("점수가 90보다 큽니다");
      System.out.println("등급은 A입니다");

    }
    if (score < 90) {
      System.out.println("점수가 90보다 작습니다");
      System.out.println("등급은 B입니다.");
    }
  }

}
