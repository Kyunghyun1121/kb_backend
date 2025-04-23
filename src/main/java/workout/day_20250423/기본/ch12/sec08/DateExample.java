package workout.day_20250423.기본.ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {

  public static void main(String[] args) {
    LocalDateTime localDate = LocalDateTime.now();
    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    System.out.println(localDate.format(sdf));
  }

}
