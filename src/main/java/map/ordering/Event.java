package main.java.map.ordering;

public class Event {
  //attributes
  private String name;
  private String attraction;

  //constructor
  public Event(String name, String attraction) {
      this.name = name;
      this.attraction = attraction;
  }
  public String getName() {
      return name;
  }
  public String getAttraction() {
      return attraction;
  }
  @Override
  public String toString() {
      return "Event{" +
              "name='" + name + '\'' +
              ", attraction='" + attraction + '\'' +
              '}';
  }
}
