package workout.day_20250423.기본.ch12.sec08;

import java.util.Calendar;

public class CalendarExample {

  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar.get(Calendar.YEAR) + "년 "
        + (calendar.get(Calendar.MONTH) + 1) + "월 "
        + calendar.get(Calendar.DAY_OF_MONTH) + "일");

    int week = calendar.get(Calendar.DAY_OF_WEEK);
    String strWeek = null;
    switch (week) {
      case Calendar.MONDAY:
        strWeek = "월요일";
        break;
      case Calendar.TUESDAY:
        strWeek = "화요일";
        break;
      case Calendar.WEDNESDAY:
        strWeek = "수요일";
        break;
      case Calendar.THURSDAY:
        strWeek = "목요일";
        break;
      case Calendar.FRIDAY:
        strWeek = "금요일";
        break;
      case Calendar.SATURDAY:
        strWeek = "토요일";
        break;
      default:
        strWeek = "일요일";
        break;
    }
    ;
    if (calendar.get(Calendar.AM_PM) == Calendar.AM) {
      System.out.println(strWeek + " " + "오전");
    } else {
      System.out.println(strWeek + " " + "오후");
    }

    System.out.println(calendar.get(Calendar.HOUR) + "시 "
        + calendar.get(Calendar.MINUTE) + "분 "
        + calendar.get(Calendar.SECOND) + "초");
  }

}