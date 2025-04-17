package workout.day_20250417.기본.sec07.exam01;

public class PromotionExample {
  public static void main(String[] args) {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    B b1 = d;
    C c1 = e;

//    B b3 = e;
//    e의 부모는 c이고 c의 부모는 A로 B의 부모와 같지만 B와 C는 둘다 자식이므로 그 손자인
//        e를 b에 넣는것은 오류가 발생한다.
//    C c2 = d;
//    위와 동일하게 둘다 최고 조상은 A로 동일하지만 그 자식인 c에게 b의 자식인 d를
//        넣으면 오류가 발생한다.
  }
}
