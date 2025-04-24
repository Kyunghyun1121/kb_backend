package study.ch14.ex01;

import java.util.Scanner;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Player implements Runnable {
  private String name;


  @Override
  public void run() {
    try{
      int curr = 0;

      while (curr != Main.count){

      }

      synchronized (Main.class){
        int callNumber = ++Main.count;

        if(callNumber == Main.finalNum){
          System.out.println("벌칙 당첨");
        }
      }



    }catch(Exception e){
      e.printStackTrace();
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("참가할 인원 수 : ");

  }
}
