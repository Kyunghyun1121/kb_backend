package workout.day_20250430.심화.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {

  public static void main(String[] args) {
    TreeSet<Fruit> list = new TreeSet<>(new FruitComparator());
    list.add(new Fruit("딸기", 6000));
    list.add(new Fruit("포도", 3000));
    list.add(new Fruit("수박", 10000));

    for(Fruit fruit : list) {
      System.out.println(fruit.name + " " + fruit.price);
    }
  }

}
