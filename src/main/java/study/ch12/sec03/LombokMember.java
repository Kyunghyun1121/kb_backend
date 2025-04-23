package study.ch12.sec03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LombokMember {

  private String id;
  @NonNull
  private String name;
  private int age;
}
