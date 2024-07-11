package main.java.list.ordering;

import java.util.Comparator;
public class Person implements Comparable<Person> {
    //attributes
    private String name;
    private int age;
    private double height;
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(age, person.getAge());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
    static class ComparatorByHeight implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            return Double.compare(person1.getHeight(), person2.getHeight());
        }
    }
}
