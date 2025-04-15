package workout.day_20250415.기본.ch05.sec06;

public class ArrayLengthExample {
  public static void main(String[] args) {
    int[] scores = new int[] { 84, 90, 96 };
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    System.out.println("총합 : " + sum);
    System.out.println("평균 : " + (float)sum / scores.length);
  }



}
