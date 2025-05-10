package workout.day_20250510.기본.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

  public static void main(String[] args) throws IOException {
    String originalFileName = "C:/Temp/test.jpg";
    String targetFileName = "C:/Temp/test2.jpg";

    InputStream is = new FileInputStream(originalFileName);
    OutputStream os = new FileOutputStream(targetFileName);

    byte[] buffer = is.readAllBytes();
    for(byte b : buffer) {
      os.write(b);
    }

    os.flush();
  }

}
