package workout.day_20250423.심화.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExamplePractice {

  public static void main(String[] args) {
    long count = 0;
    boolean flag = false;
    while(!flag) {
      //System.out.println((count+1)+"차 시도 : ");
      System.out.println((count+1)+"차 시도 : ");
      Random random = new Random();
      int[] choseNumber = new int[6];
      int[] selectedNumber = new int[6];

      for(int i = 0; i < choseNumber.length; i++) {
        choseNumber[i] = random.nextInt(45) + 1;
      }

      for(int i = 0; i < choseNumber.length; i++) {
        selectedNumber[i] = random.nextInt(45) + 1;
      }

      Arrays.sort(selectedNumber);
      Arrays.sort(choseNumber);
      for(int i = 0; i < choseNumber.length; i++) {
        /*System.out.println((i+1) + "번재 번호, 내가 고른 번호 : "
            + choseNumber[i] +
            " 당첨 번호 : " + selectedNumber[i]) ;*/
        if(choseNumber[i] != selectedNumber[i]) {
          break;
        }

        if(i == choseNumber.length - 1) {
          flag = true;
          System.out.println("당첨!!");
          for(int j = 0; j < selectedNumber.length; j++) {
            System.out.println(choseNumber[j]);
          }
        }

        count++;
      }
    }


  }
}
