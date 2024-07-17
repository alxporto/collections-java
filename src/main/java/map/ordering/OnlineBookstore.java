package main.java.map.ordering;

import java.util.*;
public class OnlineBookstore {
  //attributes
  private Map<String, Book>  books;

  //constructor
  public OnlineBookstore() {
      this.books = new HashMap<>();
  }
  public void addBook(String link, Book book) {
      books.put(link, book);
  }
  public void removeBook(String title) {
      List<String> removeKeys = new ArrayList<>();
      for (Map.Entry<String, Book> entry : books.entrySet()) {
           if (entry.getValue().getTitle().equalsIgnoreCase(title)) {
               removeKeys.add(entry.getKey());
           }
      }
      for (String key : removeKeys) {
           books.remove(key);
      }
  }
  public Map<String, Book> showBooksOrderedByPrice() {
      List<Map.Entry<String, Book>> booksToOrderByPrice = new ArrayList<>(books.entrySet());
      Collections.sort(booksToOrderByPrice, new Book.comparatorByPrice());
      Map<String, Book> booksOrderedByPrice = new LinkedHashMap<>();
      for (Map.Entry<String, Book> entry : booksToOrderByPrice) {
           booksOrderedByPrice.put(entry.getKey(), entry.getValue());
      }
      return booksOrderedByPrice;
  }
  public Map<String, Book> showBooksOrderedByAuthor() {
      List<Map.Entry<String, Book>> booksToOrderByAuthor = new ArrayList<>(books.entrySet());
      Collections.sort(booksToOrderByAuthor, new Book.comparatorByAuthor());
      Map<String, Book> booksOrderedByAuthor = new LinkedHashMap<>();
      for (Map.Entry<String, Book> entry : booksToOrderByAuthor) {
           booksOrderedByAuthor.put(entry.getKey(), entry.getValue());
      }
      return booksOrderedByAuthor;
  }
  public Map<String, Book> searchBooksByAuthor(String author) {
      Map<String, Book> booksByAuthor = new LinkedHashMap<>();
      for (Map.Entry<String, Book> entry : books.entrySet()) {
           Book book = entry.getValue();
           if (book.getAuthor().equals(author)) {
               booksByAuthor.put(entry.getKey(), book);
           }
      }
      return booksByAuthor;
  }
  public List<Book> getMostExpensiveBook() {
      List<Book> mostExpensiveBooks = new ArrayList<>();
      double higherPrice = Double.MIN_VALUE;
      if (!books.isEmpty()) {
          for (Book book : books.values()) {
               if (book.getPrice() > higherPrice) {
                   higherPrice = book.getPrice();
               }
          }
      } else {
          throw new NoSuchElementException("The book was not found!");
      }
      for (Map.Entry<String, Book> entry : books.entrySet()) {
           if (entry.getValue().getPrice() == higherPrice) {
               Book bookWithHigherPrice = books.get(entry.getKey());
               mostExpensiveBooks.add(bookWithHigherPrice);
           }
      }
      return mostExpensiveBooks;
  }
  public List<Book> getCheapestBook() {
      List<Book> cheapestBooks = new ArrayList<>();
      double cheapestPrice = Double.MAX_VALUE;
      if (!books.isEmpty()) {
          for (Book book : books.values()) {
               if (book.getPrice() < cheapestPrice) {
                   cheapestPrice = book.getPrice();
               }
          }
      } else {
          throw new NoSuchElementException("The book was not found!");
      }
      for (Map.Entry<String, Book> entry : books.entrySet()) {
           if (entry.getValue().getPrice() == cheapestPrice) {
               Book bookWithLowerPrice = books.get(entry.getKey());
               cheapestBooks.add(bookWithLowerPrice);
           }
      }
      return cheapestBooks;
  }
  public static void main(String[] args) {
    //creating an instance of onlinebookstore class
    OnlineBookstore onlineBookstore = new OnlineBookstore();

    //adding the books to the bookstore
    onlineBookstore.addBook("https://amzn.to/3EclT8Z", new Book("1984", "George Orwell", 50d));
    onlineBookstore.addBook("https://amzn.to/47Umiun", new Book("A Revolução dos Bichos", "George Orwell", 7.05d));
    onlineBookstore.addBook("https://amzn.to/3L1FFI6", new Book("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
    onlineBookstore.addBook("https://amzn.to/3OYb9jk", new Book("Malorie", "Josh Malerman", 5d));
    onlineBookstore.addBook("https://amzn.to/45HQE1L", new Book("E Não Sobrou Nenhum", "Agatha Christie", 50d));
    onlineBookstore.addBook("https://amzn.to/45u86q4", new Book("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

    //showing all the books ordered by price
    System.out.println("Books ordered by price: \n" + onlineBookstore.showBooksOrderedByPrice());

    //showing all the books ordered by author
    System.out.println("Books ordered by author: \n" + onlineBookstore.showBooksOrderedByAuthor());

    //searching books by author
    String authorSearch = "Josh Walerman";
    onlineBookstore.searchBooksByAuthor(authorSearch);

    //getting and showing the most expensive books
    System.out.println("The most expensive book(s): " + onlineBookstore.getMostExpensiveBook());

    //getting and showing the cheapest books
    System.out.println("The cheapest book(s): " + onlineBookstore.getCheapestBook());

    //removing a book by title
    onlineBookstore.removeBook("1984");
    System.out.println(onlineBookstore.books);
  }
}
