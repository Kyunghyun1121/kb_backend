package workout.day_20250416.기본.sec08.exam03;

public class Car {
  int gas;

  void setGas(int gas){
    this.gas = gas;
  }

  boolean isLeftGas(){
    if(gas != 0){
      System.out.println("gas가 있습니다");
      return true;
    }else{
      System.out.println("gas가 없습니다");
      return false;
    }
  }

  void run(){
    System.out.println("출발합니다.");
    while(true){
      if(gas > 0){
        System.out.println("달립니다 .(gas 잔량 : " + gas + ")");
        gas--;
      }else{
        System.out.println("멈춥니다 .(gas 잔량 : " + gas + ")");
        System.out.println("gas를 주입하세요.");
        break;
      }
    }
  }

}
