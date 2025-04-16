package workout.day_20250415.심화;

import java.util.Scanner;

public class bank {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int choose = 0;
    int sum = 0;
    while (true) {

      System.out.println("-----------------------------");
      System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
      System.out.println("-----------------------------");
      System.out.print("선택> ");
      choose = scanner.nextInt();
      if (choose == 1) {
        System.out.print("예금액>");
        int temp = scanner.nextInt();
        sum += temp;
      } else if (choose == 2) {
        System.out.print("출금액>");
        int temp = scanner.nextInt();
        sum -= temp;
      } else if (choose == 3) {
        System.out.println("잔고>"+sum);
      }
      else {
        break;
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("프로그램 종료");
  }


}
