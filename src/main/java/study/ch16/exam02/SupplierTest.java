package study.ch16.exam02;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {

  public static void main(String[] args) {
    Supplier<String> nameSupplier = () -> "신짱구";
    System.out.println("nameSupplier.get() = " + nameSupplier.get());

    IntSupplier randomIntSupplier = () -> {
      Random random = new Random();
      return random.nextInt(100);
    };

    System.out.println("randomIntSupplier.getAsInt() = " + randomIntSupplier.getAsInt());
    System.out.println("randomIntSupplier.getAsInt() = " + randomIntSupplier.getAsInt());
    System.out.println("randomIntSupplier.getAsInt() = " + randomIntSupplier.getAsInt());

  }

}
