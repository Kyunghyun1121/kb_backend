package workout.day_20250422.기본.sec03.exam02;

public class A {

  //정적 멤버 클래스
  static class B {

    static int field2 = 2;
    //인스턴스 필드
    int field1 = 1;

    //생성자
    B() {
      System.out.println("B-생성자 실행");
    }

    static void method2() {
      System.out.println("B-method2 실행");
    }

    //인스턴스 메소드
    void method1() {
      System.out.println("B-method1 실행");
    }
  }
}
