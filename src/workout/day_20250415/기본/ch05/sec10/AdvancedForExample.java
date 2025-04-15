package workout.day_20250415.기본.ch05.sec10;

public class AdvancedForExample {

  public static void main(String[] args) {
    int[] scores = {95, 71, 84, 93, 87};
    int sum = 0;
    for(int i : scores) {
      sum += i;
    }
    System.out.println("총합 : " + sum);
    System.out.println("평균 : " + (float)sum / 3);
  }
}
