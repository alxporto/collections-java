package main.java.set.ordering;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
  //attributes
  private long cod;
  private String name;
  private double price;
  private int amount;
  public Product(long cod, String name, double price, int amount) {
      this.cod = cod;
      this.name = name;
      this.price = price;
      this.amount = amount;
  }

  @Override
  public int compareTo(Product product) {
      return name.compareToIgnoreCase(product.getName());
  }
  public long getCod() {
      return cod;
  }
  public String getName() {
      return name;
  }
  public double getPrice() {
      return price;
  }
  public int getAmount() {
      return amount;
  }

  @Override
  public boolean equals(Object object) {
      if (this == object) return true;
      if (!(object instanceof Product product)) return false;
      return getCod() == product.getCod();
  }

  @Override
  public int hashCode() {
      return Objects.hash(getCod());
  }

  @Override
  public String toString() {
      return "Product{" +
              "cod=" + cod +
              ", name='" + name + '\'' +
              ", price=" + price +
              ", amount=" + amount +
              '}';
  }
}
class ComparatorByPrice implements Comparator<Product> {
  @Override
  public int compare(Product product1, Product product2) {
      return Double.compare(product1.getPrice(), product2.getPrice());
  }
}
