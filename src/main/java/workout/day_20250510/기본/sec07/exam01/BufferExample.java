package workout.day_20250510.기본.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

  public static void main(String[] args) throws IOException {
    String originalFileName = "C:/Temp/originalFile1.jpg";
    String targetFileName = "C:/Temp/originalFile2.jpg";

    InputStream is = new BufferedInputStream(new FileInputStream(originalFileName));
    OutputStream os = new BufferedOutputStream(new FileOutputStream(targetFileName));

    long start = System.nanoTime();

    while(true) {
      int data = is.read();
      if (data == -1) {
        break;
      }
      os.write(data);
    }
    os.flush();
    long end = System.nanoTime();
    System.out.println("걸린 시간 : " + (end - start) + "ms");


  }

}
