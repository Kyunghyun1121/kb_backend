package workout.day_20250421.기본.sec08;

public class MultiInterfaceImplExample {

  public static void main(String[] args) {
    RemoteControl rc = new SmartTelevision();
    rc.turnOn();
    rc.turnOff();
    Searchable searchable = new SmartTelevision();
    searchable.search("https://www.youtube.com");
  }

}
