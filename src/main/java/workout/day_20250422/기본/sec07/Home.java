package workout.day_20250422.기본.sec07;

public class Home {
  RemoteControl remoteControl = new RemoteControl() {

    @Override
    public void turnOn() {
      System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
      System.out.println("TV를 끕니다.");
    }
  };

  public void use1(){
    remoteControl.turnOn();
    remoteControl.turnOff();
  }
}
