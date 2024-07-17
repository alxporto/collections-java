package main.java.map.search;

public class Product {
  //attributes
  private String name;
  private double price;
  private int amount;

  //constructor
  public Product(String name, double price, int amount) {
      this.name = name;
      this.price = price;
      this.amount = amount;
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
  public String toString() {
      return "Product{" +
              "name='" + name + '\'' +
              ", price=" + price +
              ", amount=" + amount +
              '}';
      }
  }
