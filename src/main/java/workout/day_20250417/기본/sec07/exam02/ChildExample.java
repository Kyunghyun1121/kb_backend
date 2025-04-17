package workout.day_20250417.기본.sec07.exam02;

public class ChildExample {
  public static void main(String[] args) {
    Child child = new Child();
    Parent parent = child;
    parent.method1();
    parent.method2();
//    parent.method3();
//    method3가 child에는 있지만 parent에는 없기 때문에 parent타입인 parent에서는 사용할 수
//        없다.
  }
}
