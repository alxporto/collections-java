package main.java.set.search;

public class Task {
  //attributes
  private String description;
  private boolean done;

  //constructor
  public Task(String description) {
      this.description = description;
      this.done = false;
  }
  public String getDescription() {
      return description;
  }
  public boolean isDone() {
      return done;
  }
  public void setDescription(String description) {
      this.description = description;
  }
  public void setDone(boolean done) {
      this.done = done;
  }

  @Override
  public String toString() {
      return "Task{" +
              "description='" + description + '\'' +
              ", done=" + done +
              '}';
  }
}
