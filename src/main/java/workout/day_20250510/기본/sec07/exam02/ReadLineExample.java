package workout.day_20250510.기본.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
  public static void main(String[] args) throws IOException {
    String path = "c:/temp/test3.txt";
    BufferedReader br = new BufferedReader(new FileReader(path));

    int line = 1;
    while(true) {
      String str = br.readLine();
      if (str == null) {break;}
      System.out.println(str);
      line++;
    }
  }
}
