package workout.day_20250414.기본.ch01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);
        int temp = y;
        y = x;
        x = temp;
        System.out.println("x:" + x + ", y:" + y);
    }
}
