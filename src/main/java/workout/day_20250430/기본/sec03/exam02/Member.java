package workout.day_20250430.기본.sec03.exam02;

public class Member{
  public String name;
  public int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {
    return name.hashCode() + age;
  }

  @Override
  public boolean equals(Object obj) {
    Member member = (Member) obj;
    if(member.hashCode() == this.hashCode()){
      return true;
    }else{
      return false;
    }
  }
}
