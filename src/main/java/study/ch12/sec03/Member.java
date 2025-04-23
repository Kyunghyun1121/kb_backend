package study.ch12.sec03;

import java.util.Objects;

public class Member {
  public String id;
  public Member(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(id, member.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
