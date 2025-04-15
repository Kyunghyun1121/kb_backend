package workout.day_20250415.심화;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class PrimitiveAndStringConversionExample {

  public static void main(String[] args) {
    int value1 = parseInt("10");
    double value2 = parseDouble("3.14");
    boolean value3 = parseBoolean("true");
    System.out.println("value1: " + value1);
    System.out.println("value2: " + value2);
    System.out.println("value3: " + value3);

    String str1 = String.valueOf(10);
    String str2 = String.valueOf(3.14);
    String str3 = String.valueOf(true);
    System.out.println("str1: " + str1);
    System.out.println("str2: " + str2);
    System.out.println("str3: " + str3);
  }
}
