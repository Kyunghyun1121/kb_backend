package workout.day_20250510.기본.sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class CharacterConvertStreamExample {

  public static void main(String[] args) throws IOException {
    String str = "문자 변환 스트림을 사용합니다.";
    OutputStream fis = new FileOutputStream("c:/temp/test.txt");
    fis.write(str.getBytes());
    fis.close();

    InputStream fis2 = new FileInputStream("c:/temp/test.txt");
    Reader reader = new InputStreamReader(fis2, "UTF-8");
    char[] b = new char[1024];
    int num = reader.read(b);
    System.out.println(new String(b, 0, num));

  }

}
