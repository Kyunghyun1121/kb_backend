package workout.day_20250508.기본.sec07.exam01;

import lombok.Data;

@Data
public class Student implements Comparable<Student> {
  private String name;
  private int score;
  public Student (String name, int score) {
    this.name = name;
    this.score =score;
  }

  public String getName () { return name; }

  public int getScore () { return score; }

  @Override
  public int compareTo(Student o) {
    return this.score - o.score;
  }

  public int reverseCompareTo(Student o) {
    return o.score - this.score;
  }

}
