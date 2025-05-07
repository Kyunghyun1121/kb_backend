package study.ch16.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefTest {
  public static void main(String[] args) {
    /* 정적 메서드 참조 */
    Function<Integer, Integer> abs1 = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer integer) {
        return Math.abs(integer);
      }
    };
    System.out.println("abs1.apply(-10) = " + abs1.apply(-10));

    // 람다식
    Function<Integer, Integer> abs2 = integer -> Math.abs(integer);
    System.out.println("abs2.apply(-10) = " + abs2.apply(-10));

    // 정적 메서드 참조
    Function<Integer, Integer> abs3 = Math::abs;
    System.out.println("abs3.apply(-10) = " + abs3.apply(-10));

    // 인스턴스 메서드 참조
    String str = "Hello World";
    Supplier<String> lower1 = new Supplier<String>() {
      @Override
      public String get() {
        return str.toLowerCase();
      }
    };
    Supplier<String> lower2 = () -> str.toLowerCase();
    Supplier<String> lower3 = str::toLowerCase;

    System.out.println("lower1.get() = " + lower1.get());
    System.out.println("lower2.get() = " + lower2.get());
    System.out.println("lower3.get() = " + lower3.get());


    Function<String, Integer> strLength = String::length;
    System.out.println("strLength.get() = " + strLength.apply("Hello World"));

    List<String> nameList = new ArrayList<String>();
    nameList.add("John");
    nameList.add("Jane");
    nameList.add("Bob");
    nameList.add("Mary");

    nameList.forEach(name -> System.out.println(name));
    nameList.forEach(System.out::println);
      // 전달받은 내용을 출력한다.
      // nameList의 모든 요소를 순차 접근 하면서 각 요소를 System.out(PrintStram)의 println의
      // 매개 변수로 전달하여 수행한다.

    BinaryOperator<Integer> sum = (a, b) -> a + b;
    System.out.println("sumTwoNumbers(sum, 10, 20) = " + sumTwoNumbers(sum, 10, 20));

    System.out.println("sumTwoNumbers(sum, 10, 20) = " +
        sumTwoNumbers((a, b) -> a + b, 10, 20));

    System.out.println("sumTwoNumbers(sum, 10, 20) = " +
        sumTwoNumbers(MethodRefTest::sum, 10, 20));

  }

  public static int sumTwoNumbers(BinaryOperator<Integer> op, int a, int b) {
    return op.apply(a, b);
  }

  public static int sum(int a, int b) {
    return a + b;
  }
}
