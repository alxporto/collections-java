package main.java.set.search;

import java.util.Objects;
public class Contact {
  //attributes
  private String name;
  private int phoneNumber;
  public Contact(String name, int phoneNumber) {
      this.name = name;
      this.phoneNumber = phoneNumber;
  }
  public String getName() {
      return name;
  }
  public int getPhoneNumber() {
      return phoneNumber;
  }
  public void setPhoneNumber(int phoneNumber) {
      this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object object) {
      if (this == object) return true;
      if (!(object instanceof Contact contact)) return false;
      return Objects.equals(getName(), contact.getName());
  }
  @Override
  public int hashCode() {
      return Objects.hash(getName());
  }

  @Override
  public String toString() {
      return "{" + name + "," + phoneNumber + "}";
  }
}
