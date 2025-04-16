package workout.day_20250416.기본.sec08.exam02;

public class Computer {
  public int sum(int ... arr){
    int all = 0;
    for(int i : arr)all+=i;
    return all;
  }
}
