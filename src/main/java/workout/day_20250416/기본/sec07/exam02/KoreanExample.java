package workout.day_20250416.기본.sec07.exam02;

public class KoreanExample {

  public static void main(String[] args) {
    Korean k1 = new Korean();
    k1.name = "박자바";
    k1.ssn = "011225-1234567";
    Korean k2 = new Korean();
    k2.name = "김자바";
    k2.ssn = "930525-0654321";

    System.out.println("k1.nation: " + k1.nation + '\n' +"k1.name: " + k1.name
    + '\n' +"k1.ssn: " + k1.ssn);
    System.out.println();
    System.out.println("k2.nation: " + k2.nation + '\n' +"k2.name: " + k2.name
        + '\n' +"k2.ssn: " + k2.ssn);
  }

}
