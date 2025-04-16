package workout.day_20250415.기본.ch05.sec06;

public class ArrayCreateByValueListExample {

  public static void main(String[] args) {
    String[] season = { "Spring", "Summer", "Fall", "Winter" };
    for (int i = 0; i < 4; i++) {
      System.out.println("season[" + i + "] : " + season[i]);
    }
    int[] scores = { 83, 90, 87 };
    int sum = 0;
    for(int score : scores) sum+=score;
    System.out.println("총합 : " + sum);
    System.out.println("평균 : " + (float)sum / 3);
  }

}
