package workout.day_20250423.심화.sec09;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatExample {

  public static void main(String[] args) {
    Date now = new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println(dateFormat.format(now));

    dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
    System.out.println(dateFormat.format(now));

    dateFormat = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
    System.out.println(dateFormat.format(now));

    int week = now.getDay() + 1;
    switch (week) {
      case Calendar.MONDAY:
        System.out.println("오늘은 월요일");
        break;
      case Calendar.TUESDAY:
        System.out.println("오늘은 화요일");
        break;
      case Calendar.WEDNESDAY:
        System.out.println("오늘은 수요일");
        break;
      case Calendar.THURSDAY:
        System.out.println("오늘은 목요일");
        break;
      case Calendar.FRIDAY:
        System.out.println("오늘은 금요일");
        break;
      case Calendar.SATURDAY:
        System.out.println("오늘은 토요일");
        break;
      default:
        System.out.println("오늘은 일요일");
        break;
    }
  }

}
