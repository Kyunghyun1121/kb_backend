package workout.day_20250508.기본.sec07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("홍길동", 30));
    studentList.add(new Student("신용권", 10));
    studentList.add(new Student("유미선", 20));

    studentList.sort(Comparator.comparingInt(Student::getScore));
    studentList.forEach(s -> System.out.println(s.getName()+": "+s.getScore()));
    System.out.println();
    studentList.sort(Comparator.comparingInt(Student::getScore).reversed());
    studentList.forEach(s -> System.out.println(s.getName()+": "+s.getScore()));

  }

}
