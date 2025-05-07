package workout.day_20250507.심화.sec05.exam01;

public class MethodReferenceExample {

  public static void main(String[] args) {
    Person person = new Person();
    person.action((x, y)-> x+y);

    Computer com = new Computer();
    person.action(com::instanceMethod);
  }

}
