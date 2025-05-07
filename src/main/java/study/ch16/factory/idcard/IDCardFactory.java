package study.ch16.factory.idcard;

import study.ch16.factory.framework.Factory;
import study.ch16.factory.framework.Product;

public class IDCardFactory extends Factory {

  @Override
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  protected void registerProduct(Product product) {
    System.out.println(product);
  }
}
