package workout.day_20250415.기본.ch05.sec05;

public class IndexOfContainsExample {

  public static void main(String[] args) {
    String subject = "자바 프로그래밍";
    System.out.println(subject.indexOf("프로그래밍"));
    String[] temp = subject.split(" ");
    System.out.println(temp[0] + "와 관련된 책이군요.");
  }

}
