package workout.day_20250510.기본.sec04.exam02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

  public static void main(String[] args) throws IOException {
    Reader is = new FileReader("c:/temp/test.txt");
    while(true){
      int ch = is.read();
      if(ch == -1){
        break;
      }
      System.out.print((char)ch);
    }
    System.out.println();
    System.out.println("배열로 읽기");
    is = new FileReader("c:/temp/test.txt");
    char[] data = new char[1024];

    while(true) {
      int num = is.read(data);
      if(num == -1){
        break;
      }
      for (int i = 0; i < num; i++) {
        System.out.print(data[i]);
      }
    }
  }

}
