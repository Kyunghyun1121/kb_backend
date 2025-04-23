package workout.day_20250423.기본.ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

  public static void main(String[] args) {
    System.out.println("운영 체제 명 = " + System.getProperty("os.name"));
    System.out.println("로그인 사용자 명 = " + System.getProperty("user.name"));
    System.out.println("홈 디렉토리 = " + System.getProperty("user.home"));

    System.out.println("시스템의 속성 정보 = ");
    Properties prop = System.getProperties();
    Set keys = prop.keySet();
    for (Object key : keys) {
      System.out.println(key + " = " + prop.get(key));
    }

  }
}
