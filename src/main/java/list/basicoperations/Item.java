package main.java.list.basicoperations;

public class Item {
  //attributes
  private String name;
  private double price;
  private int amount;

  public Item(String name, double price, int amount) {
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
          return "Item{" +
                           "name='" + name + '\'' +
                           ", price=" + price +
                           ", amount=" + amount +
                           '}';
  }
}
