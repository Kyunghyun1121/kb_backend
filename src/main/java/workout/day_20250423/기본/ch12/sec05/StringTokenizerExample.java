package workout.day_20250423.기본.ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

  public static void main(String[] args) {
    String data1 = "홍길동&이수홍,박연수";
    System.out.println("data1");
    String[] st = data1.split("&|,");
    for (String s : st) {
      System.out.println(s);
    }

    System.out.println();
    System.out.println("data2");
    String data2 = "홍길동/이수홍/박연수";
    StringTokenizer st2 = new StringTokenizer(data2, "/");
    while(st2.hasMoreTokens()) {
      System.out.println(st2.nextToken());
    }
  }

}
