package workout.day_20250510.기본.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

  public static void main(String[] args) throws IOException {
    InputStream is = new FileInputStream("c:/temp/test2.db");
    byte[] data = is.readAllBytes();
    for(byte b : data) {
      System.out.println("b = " + b);
    }
  }

}
