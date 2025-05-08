package workout.day_20250508.기본.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamPipeLineExample {

  public static void main(String[] args) {
    List<Student> list = Arrays.asList(
      new Student("홍길동", 10),
      new Student("신용권", 20),
      new Student("유미선", 30)
    );

    OptionalDouble avg = list.stream().mapToInt(Student::getScore).average();
    System.out.println("평균 점수: " + avg.orElse(0.0));
  }
}
