package workout.day_20250415.기본.ch05.sec04;

public class NullPointerExceptionExample {

  public static void main(String[] args) {
    int[] intArray = null;
    intArray[0] = 10;
    String str = null;
    System.out.println("총 문자 수 : " + str.length());
    //처음에 할당을 하지 않아서 문자가 입력되지 않는다.
  }
}
