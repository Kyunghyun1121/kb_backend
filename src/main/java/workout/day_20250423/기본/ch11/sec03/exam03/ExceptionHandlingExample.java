package workout.day_20250423.기본.ch11.sec03.exam03;

public class ExceptionHandlingExample {

  public static void main(String[] args) {
    String[] array = {"100", "1oo", null, "200"};

    for (int i = 0; i <= array.length; i++) {
      try{
        int value = Integer.parseInt(array[i]);
        System.out.println("array[" + i + "]: " + value);
      }catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
      }catch (NumberFormatException | NullPointerException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
