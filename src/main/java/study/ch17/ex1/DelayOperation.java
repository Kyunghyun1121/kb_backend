package study.ch17.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DelayOperation {
  public static void main(String[] args) throws InterruptedException {
    /* 지연연산
    * 최종 연산이 수행되기 전까지 중간 연산은 실행되지 않는다.
    * */
    List<String> names = Arrays.asList("철수", "유리", "신짱구", "훈발놈");

    Stream<String> stream = names.stream()
        .filter(name -> {
          System.out.println("filter : " + name);
          return name.length() > 2;
        })
        .map(name -> {
          System.out.println("map : " + name);
          return name + "님";
        });

    Thread.sleep(3000);
    stream.forEach(System.out::println);
  }
}
