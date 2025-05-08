package workout.day_20250508.기본.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
  public static int sum;

  public static void main(String[] args) {
    IntStream.range(1, 101).forEach(s -> sum += s);
    System.out.println("총합: " + sum);
  }

}
