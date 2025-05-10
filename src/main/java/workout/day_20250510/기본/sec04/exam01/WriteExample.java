package workout.day_20250510.기본.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

  public static void main(String[] args) throws IOException {
    Writer osw = new FileWriter("c:/temp/test.txt");
    char a = 'A';
    char b = 'B';
    char[] c = {'C', 'D', 'E'};

    osw.write(a);
    osw.write(b);
    osw.write(c);


    osw.close();


  }

}
