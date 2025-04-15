package workout.day_20250415.기본.ch05.sec05;

public class SubStringExample {

  public static void main(String[] args) {
    String ssn = "880815-1234567";
    String[] temp = ssn.split("-");
    String firstNum = temp[0];
    System.out.println(firstNum);

    String secondNum = temp[1];
    System.out.println(secondNum);

  }

}
