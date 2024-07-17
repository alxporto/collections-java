package main.java.map.basicoperations;

import java.util.HashMap;
import java.util.Map;
public class ContactBook {
  //attributes
  private Map<String, Integer> contactBookMap;

  //constructor
  public ContactBook() {
      this.contactBookMap = new HashMap<>();
  }
  public void addContact(String name, Integer phoneNumber) {
      contactBookMap.put(name, phoneNumber);
  }

  public void removeContact(String name) {
      if (!contactBookMap.isEmpty()) {
          contactBookMap.remove(name);
      } else {
          System.out.println("The contact book is empty!");
      }
  }
  public void showContacts() {
      if (!contactBookMap.isEmpty()) {
          System.out.println(contactBookMap);
      } else {
          System.out.println("The contact book is empty!");
      }
  }
  public Integer searchByName(String name) {
      Integer phoneNumberByName = null;
      if (!contactBookMap.isEmpty()) {
          phoneNumberByName = contactBookMap.get(name);
          if (phoneNumberByName == null) {
              System.out.println("Contact not found!");
          }
      } else {
          System.out.println("The contact book is empty!");
      }
      return phoneNumberByName;
  }
  public static void main(String[] args) {
    //creating an instance of contactbook class
    ContactBook contactBook = new ContactBook();

    //adding the contacts
    contactBook.addContact("Camila", 123456);
    contactBook.addContact("Joao", 5665);
    contactBook.addContact("Carlos", 111111);
    contactBook.addContact("Ana", 654987);
    contactBook.addContact("Maria", 444444);
    contactBook.addContact("Camila", 555555);

    //show the contacts
    contactBook.showContacts();

    //searching the phone number by name
    String nameToSearch = "Joao";
    Integer phoneNumberToSearch = contactBook.searchByName("Joao");
    System.out.println("The phone number of " + nameToSearch + ": " + phoneNumberToSearch);

    String nameNonExistantSearch = "Paula";
    Integer phoneNumberNonExistantSearch = contactBook.searchByName(nameNonExistantSearch);
    System.out.println("The phone number of " + nameNonExistantSearch + ": " + phoneNumberNonExistantSearch);
  }
}
