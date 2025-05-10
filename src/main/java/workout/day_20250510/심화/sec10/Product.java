package workout.day_20250510.심화.sec10;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Product implements Serializable {
  private String name;
  private int price;
}
