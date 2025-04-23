package workout.day_20250423.기본.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {

  public static void printLength1(String data) {
    int result = data.length();
    System.out.println("문자 수 : " + result);
  }
  /// 예외 처리가 안되어 있어서 null이 전달되면 오류가 발생합니다.

  public static void printLength2(String data) {
    try{
      int result = data.length();
      System.out.println("문자 수 : " + result);
    }catch (NullPointerException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }

  }

  public static void main(String[] args) {
    System.out.println("[프로그램 시작]\n");
    printLength1("ThisIsJava");
    printLength2("ThisIsJava");
    printLength2(null);
    System.out.println("[프로그램 종료]\n");
  }

}
