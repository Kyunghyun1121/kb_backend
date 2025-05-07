package study.ch16.factory.idcard;

import study.ch16.factory.framework.Product;

public class IDCard extends Product {
  private String owner;

  public IDCard(String owner) {
    this.owner = owner;
  }

  @Override
  public void use() {
    System.out.println(this);
  }
}
