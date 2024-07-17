package main.java.map.ordering;

import java.util.Comparator;
import java.util.Map;
public class Book {
  //attributes
  private String title;
  private String author;
  private double price;

  //constructor
  public Book(String title, String author, double price) {
      this.title = title;
      this.author = author;
      this.price = price;
  }
  public String getTitle() {
      return title;
  }
  public String getAuthor() {
      return author;
  }
  public double getPrice() {
      return price;
  }
  @Override
      public String toString() {
          return "Book{" +
                 "title='" + title + '\'' +
                 ", author='" + author + '\'' +
                 ", price='" + price + '\'' +
                 '}';
  }
  static class comparatorByPrice implements Comparator<Map.Entry<String, Book>> {
      @Override
      public int compare(Map.Entry<String, Book>  book1, Map.Entry<String, Book> book2) {
          return Double.compare(book1.getValue().getPrice(), book2.getValue().getPrice());
      }
  }
  static class comparatorByAuthor implements Comparator<Map.Entry<String, Book>> {
      @Override
      public int compare(Map.Entry<String, Book> book1, Map.Entry<String, Book> book2) {
          return book1.getValue().getAuthor().compareToIgnoreCase(book2.getValue().getAuthor());
      }
  }
}
