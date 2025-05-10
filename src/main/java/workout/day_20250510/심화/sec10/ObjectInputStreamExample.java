package workout.day_20250510.심화.sec10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInputStreamExample {
  public static void main(String[] args) throws IOException, ClassNotFoundException {

    FileInputStream fos = new FileInputStream("C:/Temp/object.dat");
    ObjectInputStream oos = new ObjectInputStream(fos);

    Member m1 = (Member) oos.readObject();
    Product p1 = (Product) oos.readObject();
    int[] arr1 = (int[]) oos.readObject();

    fos.close();
    oos.close();

    System.out.println(m1);
    System.out.println(p1);
    Arrays.stream(arr1).forEach(System.out::print);
  }
}
