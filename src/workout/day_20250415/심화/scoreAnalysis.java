package workout.day_20250415.심화;

import java.util.Scanner;

public class scoreAnalysis {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int choose = 0;
    int max = -1;
    int sum = 0;
    int studentCount = 0;
    int[] students = new int[0];
    while (true) {

      System.out.println("-----------------------------");
      System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
      System.out.println("-----------------------------");
      System.out.print("선택> ");
      choose = scanner.nextInt();
      if (choose == 1) {
        System.out.print("학생수>");
        int temp = scanner.nextInt();
        studentCount = temp;
        students = new int[studentCount];
      } else if (choose == 2) {
        for(int j = 0; j<studentCount; j++){
          System.out.print("scores[" + j + "]>" );
          int temp = scanner.nextInt();
          students[j] = temp;
          max = Math.max(max, temp);
          sum+=temp;
        }
      } else if (choose == 3) {
        for(int j = 0; j<studentCount; j++){
          System.out.println("scores[" + j + "]>" + students[j]);
        }
      }else if (choose == 4) {
        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + (float)(sum/studentCount));
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
