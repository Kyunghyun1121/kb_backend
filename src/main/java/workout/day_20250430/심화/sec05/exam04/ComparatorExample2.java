package workout.day_20250430.심화.sec05.exam04;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample2 {

  public static void main(String[] args) {
    TreeSet<Fruit> list = new TreeSet<>(new Comparator<>() {
      @Override
      public int compare(Fruit o1, Fruit o2) {
        return o1.price - o2.price;
      }
    });

    list.add(new Fruit("딸기", 6000));
    list.add(new Fruit("포도", 3000));
    list.add(new Fruit("수박", 10000));


    for(Fruit fruit : list) {
      System.out.println(fruit.name + " " + fruit.price);
    }
  }
}
