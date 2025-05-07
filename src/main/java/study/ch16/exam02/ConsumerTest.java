package study.ch16.exam02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

  public static void main(String[] args) {
    Consumer<String> printString = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println("s = " + s);
      }
    };
    printString.accept("hello");

    // 람다식으로 변경
    Consumer<String> printString2 = (s2) -> {
      System.out.println("s2 = " + s2);
    };
    printString2.accept("hello");

    // BiConsumer<T, U> : 매개변수 T, U 두개 소비
    BiConsumer<String, Integer> printString3 = (s3, age) -> {
      System.out.println("s3 = " + s3 + ", age = " + age);
    };
    printString3.accept("hello", 20);

  }

}
