package main.java.map.ordering;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class EventsBook {
  //attributes
  private Map<LocalDate, Event> eventsMap;

  //constructor
  public EventsBook() {
      this.eventsMap = new HashMap<>();
  }
  public void addEvent(LocalDate date, String eventName, String attractionDescription) {
      eventsMap.put(date, new Event(eventName, attractionDescription));
  }
  public void showEventsBook() {
      Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(eventsMap);
      for (Map.Entry<LocalDate, Event> entry : eventsMap.entrySet()) {
           LocalDate eventDate = entry.getKey();
           Event event = entry.getValue();
           System.out.println("Date: " + eventDate + ", Event: " + event.getName() + ", Attraction: " + event.getAttraction());
      }
  }
  public void getNextEvent() {
      LocalDate actualDate = LocalDate.now();
      LocalDate nextDate = null;
      Event nextEvent = null;
      for (Map.Entry<LocalDate, Event> entry : eventsMap.entrySet()) {
           LocalDate eventDate = entry.getKey();
           if (eventDate.isEqual(actualDate) || eventDate.isAfter(actualDate)) {
               nextDate = eventDate;
               nextEvent = entry.getValue();
               break;
           }
      }
      if (nextEvent != null) {
          System.out.println("The next event: " + nextEvent.getName() + " will take place in " + nextDate);
      } else {
          System.out.println("There are no upcoming events on the agenda ");
      }
  }
  public static void main(String[] args) {
      //creating an instance to the eventsbook class
      EventsBook eventsBook = new EventsBook();

      //adding events to the events book
      eventsBook.addEvent(LocalDate.of(2022, Month.JULY, 15), "Tech Conference","Renowned speaker");
      eventsBook.addEvent(LocalDate.of(2022, 7, 9), "Programming Workshop","Development classes");
      eventsBook.addEvent(LocalDate.of(2000, 1, 10), "Campus Party","Renowned speaker");
      eventsBook.addEvent(LocalDate.of(2024, 9, 28), "Artificial Intelligence Seminar","Advanced AI Discussion");

      //showing the whole agenda of events
      eventsBook.showEventsBook();

      //getting and showing the next event in the agenda
      eventsBook.getNextEvent();
  }
}
