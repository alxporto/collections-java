package main.java.list.ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingNumbers {
  //attributes
  private List<Integer> numbersList;

  //constructor
  public OrderingNumbers() {
    this.numbersList = new ArrayList<>();
  }
  public void addNumber(int number) {
    this.numbersList.add(number);
  }
  public List<Integer> ascendingOrder() {
    List<Integer> ascendingNumbers = new ArrayList<>(this.numbersList);
    if (!numbersList.isEmpty()) {
        Collections.sort(ascendingNumbers);
        return ascendingNumbers;
    } else {
        throw new RuntimeException("The list is empty!");
    }
  }
  public List<Integer> descendingOrder() {
    List<Integer> descendingNumbers = new ArrayList<>(this.numbersList);
    if (!numbersList.isEmpty()) {
        descendingNumbers.sort(Collections.reverseOrder());
      return descendingNumbers;
    } else {
      throw new RuntimeException("The list is empty!");
    }
  }
  public void showNumbers() {
    if (!numbersList.isEmpty()) {
        System.out.println(this.numbersList);
    } else {
        System.out.println("The list is empty!");
    }
  }

  public static void main(String[] args) {
    //creating an instance of the orderingnumbers class
    OrderingNumbers numbers = new OrderingNumbers();

    //adding numbers to the list
    numbers.addNumber(2);
    numbers.addNumber(5);
    numbers.addNumber(4);
    numbers.addNumber(1);
    numbers.addNumber(99);

    //showing the added numbers list
    numbers.showNumbers();

    //ordering and showing in ascending order
    System.out.println(numbers.ascendingOrder());

    //showing the list
    numbers.showNumbers();

    //ordering and showing in descending order
    System.out.println(numbers.descendingOrder());

    //showing the list
    numbers.showNumbers();
  }
}
