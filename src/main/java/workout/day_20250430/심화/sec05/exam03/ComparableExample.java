package workout.day_20250430.심화.sec05.exam03;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

  public static void main(String[] args) {
    ArrayList<Person> list = new ArrayList<>();
    list.add(new Person("홍길동", 55));
    list.add(new Person("감자바", 25));
    list.add(new Person("박지원", 31));

    System.out.println("정렬 전");
    for(Person person : list) {
      System.out.println(person.name + " " + person.age);
    }

    System.out.println("\n정렬 후");
    Collections.sort(list);
    for(Person person : list) {
      System.out.println(person.name + " " + person.age);
    }

  }

}
