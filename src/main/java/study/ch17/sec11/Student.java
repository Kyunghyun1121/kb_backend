package study.ch17.sec11;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class Student {
  private String name;
  private String sex;
  private int score;

}
