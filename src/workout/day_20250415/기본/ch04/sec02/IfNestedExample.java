package workout.day_20250415.기본.ch04.sec02;

public class IfNestedExample {

  public static void main(String[] args) {
    int score = (int)((Math.random()*20)+81);
    String grade;
    if(score >= 95){
      grade = "A+";
      System.out.println("점수 : "+score+"\n학점: "+grade);
    }else if(score >= 90){
      grade = "A";
      System.out.println("점수 : "+score+"\n학점: "+grade);
    }else if(score >= 85){
      grade = "B+";
      System.out.println("점수 : "+score+"\n학점: "+grade);
    }else if(score >= 81){
      grade = "B";
      System.out.println("점수 : "+score+"\n학점: "+grade);
    }

  }
}
