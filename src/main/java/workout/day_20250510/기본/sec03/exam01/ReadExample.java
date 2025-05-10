package workout.day_20250510.기본.sec03.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

  public static void main(String[] args) throws IOException {
    InputStream is = new FileInputStream("c:/temp/test1.db");
    int data = is.read();
    while(data != -1){
      System.out.println("data = " + data);
      data = is.read();
    }
  }

}
