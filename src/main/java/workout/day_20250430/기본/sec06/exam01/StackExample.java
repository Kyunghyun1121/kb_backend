package workout.day_20250430.기본.sec06.exam01;

import java.util.Stack;

public class StackExample {

  public static void main(String[] args) {
    Stack<Coin>stack = new Stack<>();
    stack.add(new Coin(100));
    stack.add(new Coin(50));
    stack.add(new Coin(500));
    stack.add(new Coin(10));

    while(!stack.isEmpty()) {
      Coin coin = stack.pop();
      System.out.println("꺼내온 동전 : " + coin.getValue()+ "원");
    }
  }

}
