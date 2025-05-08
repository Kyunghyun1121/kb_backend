package workout.day_20250508.기본.sec04.exam01;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
  private int pno;
  private String name;
  private String company;
  private int price;
}
