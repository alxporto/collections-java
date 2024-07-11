package main.java.list.basicoperations;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
  //attributes
  private List<Item> itemList;

  public ShoppingCart() {
    this.itemList = new ArrayList<>();
  }

  public void addItem(String name, double price, int amount) {
    Item item = new Item(name, price, amount);
    this.itemList.add(item);
  }

  public void removeItem(String name) {
    List<Item> itemsToRemove = new ArrayList<>();
    if (!itemList.isEmpty()) {
       for (Item item : itemList) {
          if (item.getName().equalsIgnoreCase(name)) {
              itemsToRemove.add(item);
          }
       }
       itemList.removeAll(itemsToRemove);
    } else {
      System.out.println("The list is empty!");
    }
  }

  public double calculateTotalValue() {
    double totalValue = 0d;
    if (!itemList.isEmpty()) {
      for (Item item : itemList) {
        double itemValue = item.getPrice() * item.getAmount();
        totalValue += itemValue;
      }
      return totalValue;
    } else {
      throw new RuntimeException("The list is empty!");
    }
  }

  public void showItems() {
    if (!itemList.isEmpty()) {
      System.out.println(this.itemList);
    } else {
      System.out.println("The list is empty!");
    }
  }

  @Override
  public String toString() {
    return "ShoppingCart{" +
            "items=" + itemList +
            '}';
  }

  public static void main(String[] args) {
    //creating an instance of the shopping cart class
    ShoppingCart shoppingCart = new ShoppingCart();

    //adding items to the cart
    shoppingCart.addItem("Pencil", 2d, 3);
    shoppingCart.addItem("Pen", 2d, 3);
    shoppingCart.addItem("Notebook", 35d, 1);
    shoppingCart.addItem("Sharpener", 2d, 3);
    shoppingCart.addItem("Rubber", 2d, 2);

    //showing the items in the cart
    shoppingCart.showItems();

    //removing an item from the cart
    shoppingCart.removeItem("Pencil");

    //showing the updated items in the cart
    shoppingCart.showItems();

    //calculating and displaying the total purchase value
    System.out.println("The purchase total value is = " + shoppingCart.calculateTotalValue());
  }
}
