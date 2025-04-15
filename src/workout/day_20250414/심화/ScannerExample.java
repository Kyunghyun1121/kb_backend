package workout.day_20250414.심화;

import java.util.Scanner;

public class ScannerExample {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("입력 문자열: ");
      String s = sc.nextLine();
      if (s.equals("q")) {
        break;
      }
      System.out.println("출력 문자열: " + s);
      System.out.println();
    }
  }

}
