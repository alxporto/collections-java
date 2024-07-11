package main.java.list.basicoperations;

public class Task {
  //attributes
  private String description;

  public Task(String description) {
      this.description = description;
  }
  public String getDescription() {
      return description;
  }

  @Override
  public String toString() {
      return description;
  }
}
