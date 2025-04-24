package study.ch14;

public class Knight extends Thread{
  Bridge bridge;
  String name;
  String address;

  public Knight(Bridge bridge, String name, String address) {
    this.bridge = bridge;
    this.name = name;
    this.address = address;
  }

  @Override
  public void run() {

  }
}
