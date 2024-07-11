package main.java.list.ordering;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class OrderingPerson {
  //attributes
  private List<Person> personList;
  public OrderingPerson() {
      this.personList = new ArrayList<>();
  }
  public void addPerson(String name, int age, double height) {
      personList.add(new Person(name, age, height));
  }
  public List<Person> orderByAge() {
      List<Person> peopleByAge = new ArrayList<>(personList);
      Collections.sort(peopleByAge);
      return peopleByAge;
  }
  public List<Person> orderByHeight() {
      List<Person> peopleByHeight = new ArrayList<>(personList);
      Collections.sort(peopleByHeight, new Person.ComparatorByHeight());
      return peopleByHeight;
  }

  public static void main(String[] args) {
    OrderingPerson orderingPerson = new OrderingPerson();

    orderingPerson.addPerson("Name 1", 20, 1.56);
    orderingPerson.addPerson("Name 2", 30, 1.80);
    orderingPerson.addPerson("Name 3", 25, 1.78);
    orderingPerson.addPerson("Name 4", 17, 1.80);

    System.out.println(orderingPerson.personList);

    System.out.println(orderingPerson.orderByAge());
    System.out.println(orderingPerson.orderByHeight());
  }
}
