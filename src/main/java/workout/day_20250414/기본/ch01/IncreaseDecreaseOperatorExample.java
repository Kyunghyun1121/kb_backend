package workout.day_20250414.기본.ch01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 0;

        x++;
        ++x;
        System.out.println("x=" + x);
        System.out.println("-----------------------");
        y--;
        --y;
        System.out.println("y=" + y);
        System.out.println("-----------------------");

        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("-----------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("-----------------------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
