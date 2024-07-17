package main.java.set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
  //attributes
  private Set<Contact> contactsSet;

  //constructor
  public ContactBook() {
      this.contactsSet = new HashSet<>();
  }
  public void addContact(String name, int phoneNumber) {
      contactsSet.add(new Contact(name, phoneNumber));
  }
  public void showContacts() {
      if (!contactsSet.isEmpty()) {
          System.out.println(contactsSet);
      } else {
          System.out.println("The set is empty!");
      }
  }
  public Set<Contact> searchByName(String name) {
      Set<Contact> contactsByName = new HashSet<>();
      if (!contactsSet.isEmpty()) {
          for (Contact contact : contactsSet) {
               if (contact.getName().startsWith(name)) {
                   contactsByName.add(contact);
               }
          }
        return contactsByName;
      } else {
        throw new RuntimeException("The set is empty!");
      }
  }
  public Contact updatePhoneNumber(String name, int newNumber) {
      Contact updatedPhoneNumber = null;
      if (!contactsSet.isEmpty()) {
          for (Contact contact : contactsSet) {
              if (contact.getName().equalsIgnoreCase(name)) {
                  contact.setPhoneNumber(newNumber);
                  updatedPhoneNumber = contact;
                  break;
              }
          }
        return updatedPhoneNumber;
      } else {
        throw new RuntimeException("The set is empty!");
      }
  }

  public static void main(String[] args) {
    //creating an instance of contactbook class
    ContactBook contactBook = new ContactBook();

    //showing the contacts in the set (must be empty)
    contactBook.showContacts();

    //adding the contacts to the contact book
    contactBook.addContact("Joao", 123456789);
    contactBook.addContact("Maria", 987654321);
    contactBook.addContact("Maria Fernandes", 55555555);
    contactBook.addContact("Ana", 88889999);
    contactBook.addContact("Fernando", 77778888);
    contactBook.addContact("Carolina", 55555555);

    //displaying the contacts in contact book
    contactBook.showContacts();

    //searching contacts by name
    System.out.println(contactBook.searchByName("Maria"));

    //updating the phone number of a contact
    Contact updatedPhoneNumber = contactBook.updatePhoneNumber("Carolina", 44443333);
    System.out.println("Updated phone number of a contact: " + updatedPhoneNumber);

    //showing the updated contacts in the contact book
    System.out.println("Contact Book after update");
    contactBook.showContacts();
  }
}
