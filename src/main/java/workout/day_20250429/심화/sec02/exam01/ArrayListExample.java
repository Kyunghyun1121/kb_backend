package workout.day_20250429.심화.sec02.exam01;

import java.util.ArrayList;

public class ArrayListExample {

  public static void main(String[] args) {
    ArrayList<Board>arrayList = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      arrayList.add(new Board());
    }

    System.out.println(arrayList.size());
    System.out.println("3번째 데이터: " + arrayList.get(3));

    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println("각 요소 출력: " +arrayList.get(i));
    }
    arrayList.remove(2);
    arrayList.remove(2);
    for(Board b : arrayList){
      System.out.println("향상된 for문 출력: " +b);
    }
  }

}
