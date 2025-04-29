package workout.day_20250429.기본.sec02.exam01;

public class GenericExample {

  public static void main(String[] args) {
    Product<Tv> product1 = new Product<>();
    product1.setKind(new Tv());
    product1.setModel("스마트 Tv");

    Tv tv = product1.getKind();
    String tvModel = product1.getModel();
    System.out.println(tvModel);

    Product<Car> product2 = new Product<>();
    product2.setKind(new Car());
    product2.setModel("SUV 자동차");

    Car car = product2.getKind();
    String carModel = product2.getModel();
    System.out.println(carModel);
  }

}
