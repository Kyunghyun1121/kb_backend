package study.ch05.sec13;

public class GradeExample {
    public static void main(String[] args) {
        Grade myGrade = Grade.B;
        System.out.println("myGrade = " + myGrade);
        System.out.println(myGrade.getScore());
        System.out.println(myGrade.getDescription());
    }
}
