package workout.day_20250429.기본.sec02.exam01;

public class Product <T>{
  public T kind;
  public String model;

  public T getKind() {
    return kind;
  }

  public void setKind(T kind) {
    this.kind = kind;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
