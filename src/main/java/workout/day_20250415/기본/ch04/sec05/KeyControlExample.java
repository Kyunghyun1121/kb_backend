package workout.day_20250415.기본.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int choose = 0;
    int sum = 0;
    while (choose != 3) {
      System.out.println("-----------------------------");
      System.out.println("1.증속 | 2. 감속 | 3. 중지");
      System.out.println("-----------------------------");
      System.out.print("선택: ");
      choose = scanner.nextInt();
      if (choose == 1) {
        sum += 1;
      } else if (choose == 2) {
        sum--;
      } else {
        break;
      }
      System.out.println("현재 속도 = " + sum);
    }
    System.out.println("3\n프로그램 종료 1");
  }

}
