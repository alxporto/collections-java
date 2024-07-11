package main.java.list.search;

import java.util.ArrayList;
import java.util.List;

public class NumbersSum {
  //attributes
  private List<Integer> numbers;

  //constructor
  public NumbersSum() {
    this.numbers = new ArrayList<>();
  }

  public void addNumber(int number) {
    this.numbers.add(number);
  }

  public int calculateSum() {
    int sum = 0;
    for (Integer number : numbers)
         sum += number;
    return sum;
  }

  public int findLargestNumber() {
    int largestNumber = Integer.MIN_VALUE;
    if (!numbers.isEmpty()) {
        for (Integer number : numbers) {
             if (number >= largestNumber) {
                 largestNumber = number;
             }
        }
        return largestNumber;
    } else {
      throw new RuntimeException("The list is empty!");
    }
  }

  public int findSmallestNumber() {
    int smallestNumber = Integer.MAX_VALUE;
    if (!numbers.isEmpty()) {
      for (Integer number : numbers) {
        if (number <= smallestNumber) {
            smallestNumber = number;
        }
      }
      return smallestNumber;
    } else {
      throw new RuntimeException("The list is empty!");
    }
  }

  public void showNumbers() {
    if (!numbers.isEmpty()) {
        System.out.println(this.numbers);
    } else {
        System.out.println("The list is empty!");
    }
  }

  public static void main(String[] args) {
    //creating an instance of numberssum class
    NumbersSum numbersSum = new NumbersSum();

    //adding numbers to the list
    numbersSum.addNumber(5);
    numbersSum.addNumber(3);
    numbersSum.addNumber(0);
    numbersSum.addNumber(-4);
    numbersSum.addNumber(35);

    //showing the added mubers list
    System.out.println("Added numbers:");
    numbersSum.showNumbers();

    //calculating and showing the mumbers sum in the list
    System.out.println("Numbers sum = " + numbersSum.calculateSum());

    //finding and showing the largest number in the list
    System.out.println("Largest number = " + numbersSum.findLargestNumber());

    //finding and showing the smallest number in the list
    System.out.println("Smallest number = " + numbersSum.findSmallestNumber());
  }
}
