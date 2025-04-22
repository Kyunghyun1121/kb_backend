package workout.day_20250422.심화.sec05;

public class A {

  //A 인스턴스 필드
  String field = "A-field";

  //A 인스턴스 메소드
  void method() {
    System.out.println("A-method");
  }

  //A의 인스턴스 메소드
  void useB() {
    B b = new B();
    b.print();
  }

  //인스턴스 멤버 클래스
  class B {

    //B 인스턴스 필드
    String field = "B-field";

    //B 인스턴스 메소드
    void method() {
      System.out.println("B-method");
    }

    void print() {
      System.out.println(this.field);
      this.method();
      System.out.println(A.this.field);
      A.this.method();
    }
  }
}
