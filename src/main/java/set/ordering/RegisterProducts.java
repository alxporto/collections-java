package main.java.set.ordering;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class RegisterProducts {
  //attributes
  private Set<Product> productSet;

  //constructor
  public RegisterProducts() {
      this.productSet = new HashSet<>();
  }
  public void addProduct(long cod, String name, double price, int amount) {
      productSet.add(new Product(cod, name, price, amount));
  }
  public Set<Product> showProductsByName() {
      Set<Product> productsByName = new TreeSet<>(productSet);
      if (!productSet.isEmpty()) {
          return productsByName;
      } else {
          throw new RuntimeException("The set is empty!");
      }
  }
  public Set<Product> showProductsByPrice() {
      Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
      if (!productSet.isEmpty()) {
          productsByPrice.addAll(productSet);
          return productsByPrice;
      } else {
          throw new RuntimeException("The set is empty!");
      }
  }

  public static void main(String[] args) {
    //creating an instance of registerproducts
    RegisterProducts registerProducts = new RegisterProducts();

    //adding the products
    registerProducts.addProduct(11, "Smartphone", 1000d, 10);
    registerProducts.addProduct(21, "Notebook", 1500d, 5);
    registerProducts.addProduct(11, "Mouse", 30d, 20);
    registerProducts.addProduct(41, "Keyboard", 50d, 15);

    //showing all the products
    System.out.println(registerProducts.productSet);

    //showing the products ordered by name
    System.out.println(registerProducts.showProductsByName());

    //showing the products ordered by price
    System.out.println(registerProducts.showProductsByPrice());
  }
}
