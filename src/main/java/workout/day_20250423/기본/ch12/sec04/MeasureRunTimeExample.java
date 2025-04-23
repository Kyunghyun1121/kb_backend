package workout.day_20250423.기본.ch12.sec04;

public class MeasureRunTimeExample {

  public static void main(String[] args) {
    int sum = 0;

    long before = System.nanoTime();
    for(int i = 1; i <= 1000000; i++) {
      sum += i;
    }
    long after = System.nanoTime();
    System.out.println("sum = " + sum);
    System.out.println("계산 전 시간 = " + before);
    System.out.println("계산 후 시간 = " + after);
    System.out.println("걸린 시간 = " + (after - before));

  }

}
