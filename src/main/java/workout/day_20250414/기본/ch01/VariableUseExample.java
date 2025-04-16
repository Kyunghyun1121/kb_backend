package workout.day_20250414.기본.ch01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        String result = hour + "시간 " + minute + "분";
        int totalMinute = hour*60 + minute;
        System.out.println(result);
        System.out.println("총 " + totalMinute + "분");
    }
}
