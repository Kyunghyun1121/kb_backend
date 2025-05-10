package workout.day_20250510.기본.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

  public static void main(String[] args) throws IOException {
    OutputStream osw = new FileOutputStream("c:/temp/test2.db");
    byte[] array = {10, 20, 30};

    osw.write(array);

    osw.close();


  }

}
