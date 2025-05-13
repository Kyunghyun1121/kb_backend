package study.framework.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
  private Map<String, Product> showcase = new HashMap<String, Product>();

  public void register(String name, Product product) {
    showcase.put(name, product);
  }

  public Product create(String name) {
    Product product = showcase.get(name);
    return product.createCopy();
  }

}
