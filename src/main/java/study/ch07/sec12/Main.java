package study.ch07.sec12;

public class Main {

  public static void main(String[] args) {
    Animal[] aniamls = new Animal[3];
    aniamls[0] = new Animal();
    aniamls[1] = new Cat();
    aniamls[2] = new Dog();

    for(Animal a : aniamls){
      a.sound();
    }
  }

}
