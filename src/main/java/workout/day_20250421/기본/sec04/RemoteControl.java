package workout.day_20250421.기본.sec04;

public interface RemoteControl {

  int MAX_VOLUME = 10;
  int MIN_VOLUME = 0;

  void turnOn();

  void turnOff();

  void setVolume(int volume);
}
