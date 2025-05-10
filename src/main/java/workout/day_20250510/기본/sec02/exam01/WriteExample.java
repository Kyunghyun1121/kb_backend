package workout.day_20250510.기본.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

  public static void main(String[] args) throws IOException {
    OutputStream osw = new FileOutputStream("c:/temp/test1.db");
    byte a = 65;
    byte b = 95;
    byte c = 37;

    osw.write(a);
    osw.write(b);
    osw.write(c);

    osw.close();


  }

}
