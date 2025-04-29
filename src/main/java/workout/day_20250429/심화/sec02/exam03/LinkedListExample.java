package workout.day_20250429.심화.sec02.exam03;

import java.util.LinkedList;
import workout.day_20250429.심화.sec02.exam01.Board;

public class LinkedListExample {

  public static void main(String[] args) {
    LinkedList<Board> linkedList = new LinkedList<>();

    for (int i = 0; i < 5; i++) {
      linkedList.add(new Board());
    }

    System.out.println("개수 : " + linkedList.size());
    System.out.println("3번째 데이터: " + linkedList.get(2));

    for (int i = 0; i < linkedList.size(); i++) {
      System.out.println("각 요소 출력: " +linkedList.get(i));
    }
    linkedList.remove(2);
    linkedList.remove(2);
    for(Board b : linkedList){
      System.out.println("향상된 for문 출력: " +b);
    }
  }
}
