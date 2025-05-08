package study.ch17.sec11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("홍길동", "남", 92));
    students.add(new Student("김수영", "여", 87));
    students.add(new Student("감자바", "남", 95));
    students.add(new Student("오해영", "여", 93));

    students.stream()
        .filter(s -> s.getSex().equals("남"))
        .forEach(System.out::println);

    System.out.println();

    students.stream()
        .sorted((a,b) -> Integer.compare(a.getScore(), b.getScore()))
        .limit(2)
        .toList().forEach(System.out::println);

    Map<String, Integer> map = students.stream()
        .collect(
            Collectors.toMap(
                s-> s.getName(),
                s-> s.getScore()
            )
        );
    map.forEach((k,v) -> System.out.println(k + ":" + v));


  }

}
