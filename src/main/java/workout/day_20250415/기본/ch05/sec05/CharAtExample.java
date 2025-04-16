package workout.day_20250415.기본.ch05.sec05;

public class CharAtExample {

  public static void main(String[] args) {
    String ssn = "9506214230123";
    int sex = ssn.charAt(6) - '0';
    System.out.println(sex);
    if (sex % 2 == 0) {
      System.out.println("여자입니다");
    } else {
      System.out.println("남자입니다");
    }
  }

}
