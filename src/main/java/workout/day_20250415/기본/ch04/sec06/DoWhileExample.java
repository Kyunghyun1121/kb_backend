package workout.day_20250415.기본.ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("메시지를 입력하세요\n프로그램을 종료하려면 q를 입력하세요");
    String input = "";
    while(!input.equals("q")) {
      System.out.print(">");
      input = scanner.nextLine();
      System.out.println(input);
    }
    System.out.println("\n프로그램 종료");
  }

}
