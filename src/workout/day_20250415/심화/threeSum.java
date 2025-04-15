package workout.day_20250415.심화;

public class threeSum {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i < 100; i++) {
      if(i%3 == 0)sum+=i;
    }
    System.out.println("sum = " + sum);
  }

}
