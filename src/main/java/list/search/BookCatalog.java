package main.java.list.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
  //attributes
  private List<Book> bookList;
  public BookCatalog() {
      this.bookList = new ArrayList<>();
  }

  public void addBook(String title, String author, int publicationYear) {
      bookList.add(new Book(title, author, publicationYear));
  }
  public List<Book> searchByAuthor(String author) {
      List<Book> booksByAuthor = new ArrayList<>();
      if (!bookList.isEmpty()) {
          for (Book book : bookList) {
               if (book.getAuthor().equalsIgnoreCase(author)) {
                   booksByAuthor.add(book);
               }
          }
      }
      return booksByAuthor;
  }

  public List<Book> searchByYearsRange(int initialYear, int finalYear) {
      List<Book> booksByYearsRange = new ArrayList<>();
      if (!bookList.isEmpty()) {
          for (Book book : bookList) {
              if (book.getPublicationYear() >= initialYear && book.getPublicationYear() <= finalYear) {
                  booksByYearsRange.add(book);
              }
          }
      }
      return booksByYearsRange;
  }

  public Book searchByTitle(String title) {
      Book bookByTitle = null;
      if (!bookList.isEmpty()) {
          for (Book book : bookList) {
              if (book.getTitle().equalsIgnoreCase(title)) {
                  bookByTitle = book;
                  break;
              }
          }
      }
      return bookByTitle;
  }

  public static void main(String[] args) {
      BookCatalog bookCatalog = new BookCatalog();
      bookCatalog.addBook("Book 1", "Author 1", 2021);
      bookCatalog.addBook("Book 2", "Author 2", 2020);
      bookCatalog.addBook("Book 3", "Author 3", 2022);
      bookCatalog.addBook("Book 4", "Author 4", 2023);
      bookCatalog.addBook("Book 5", "Author 5", 1994);

      System.out.println(bookCatalog.searchByAuthor("Author 4"));
      System.out.println(bookCatalog.searchByYearsRange(2020, 2022));

  }

}
