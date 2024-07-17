package main.java.map.search;

import java.util.HashMap;
import java.util.Map;
public class ProductsStock {
  //attributes
  private Map<Long, Product> productsStockMap;

  //constructor
  public ProductsStock() {
      this.productsStockMap = new HashMap<>();
  }
  public void addProduct(long cod, String name, double price, int amount) {
      productsStockMap.put(cod, new Product(name, price, amount));
  }
  public void showProducts() {
      System.out.println(productsStockMap);
  }
  public double calculateStockTotalValue() {
      double stockTotalValue = 0d;
      if (!productsStockMap.isEmpty()) {
          for (Product product : productsStockMap.values()) {
               stockTotalValue += product.getAmount() * product.getPrice();
          }
      }
      return stockTotalValue;
  }
  public Product getMostExpensiveProduct() {
      Product mostExpensiveProduct = null;
      double biggestPrice = Double.MIN_VALUE;
      for (Product product : productsStockMap.values()) {
           if (product.getPrice() > biggestPrice) {
               mostExpensiveProduct = product;
               biggestPrice = product.getPrice();
           }
      }
      return mostExpensiveProduct;
  }
  public Product getCheapestProduct() {
      Product cheapestProduct = null;
      double lowestPrice = Double.MAX_VALUE;
      for (Product product : productsStockMap.values()) {
           if (product.getPrice() < lowestPrice) {
               cheapestProduct = product;
               lowestPrice = product.getPrice();
           }
      }
      return cheapestProduct;
  }

  public Product getProductGreaterAmountTotalValueInStock() {
      Product productGreaterAmountTotalValueInStock = null;
      double highestTotalValueStockProduct = 0d;
      if (!productsStockMap.isEmpty()) {
          for (Map.Entry<Long, Product> entry : productsStockMap.entrySet()) {
               double productValueInStock = entry.getValue().getPrice() * entry.getValue().getAmount();
               if (productValueInStock > highestTotalValueStockProduct) {
                   highestTotalValueStockProduct = productValueInStock;
                   productGreaterAmountTotalValueInStock = entry.getValue();
               }
          }
      }
      return productGreaterAmountTotalValueInStock;
  }
  public static void main(String[] args) {
    //creating an instance of the productsstock class
    ProductsStock stock = new ProductsStock();

    //showing the empty stock
    stock.showProducts();

    //adding products to stock
    stock.addProduct(1L, "Notebook", 1500.0, 1);
    stock.addProduct(2L, "Mousse", 25.00, 5);
    stock.addProduct(3L, "Monitor",400.0, 10);
    stock.addProduct(4L, "Keyboard", 40.0, 2);

    //showing products
    stock.showProducts();

    //calculating and showing the total value of stocks
    System.out.println("Total value of stock: $ " + stock.calculateStockTotalValue());

    //getting and showing the most expensive product
    Product mostExpensiveProduct = stock.getMostExpensiveProduct();
    System.out.println("The most expensive product: " + mostExpensiveProduct);

    //getting and showing the cheapest product
    Product cheapestProduct = stock.getCheapestProduct();
    System.out.println("The cheapest product: " + cheapestProduct);

    Product productGreaterAmountTotalValue = stock.getProductGreaterAmountTotalValueInStock();
    System.out.println("Product with the greater amount in value on stock: " + productGreaterAmountTotalValue);
  }
}
