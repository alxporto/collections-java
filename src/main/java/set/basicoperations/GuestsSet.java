package main.java.set.basicoperations;

import java.util.HashSet;
import java.util.Set;

public class GuestsSet {
  //attributes
  private Set<Guest> guestSet;

  //constructor
  public GuestsSet() {
      this.guestSet = new HashSet<>();
  }
  public void addGuest(String name, int inviteCode) {
      guestSet.add(new Guest(name, inviteCode));
  }
  public void removeGuestByInviteCode(int inviteCode) {
      Guest guestToRemove = null;
      if (!guestSet.isEmpty()) {
          for (Guest guest : guestSet) {
              if (guest.getInviteCode() == inviteCode) {
                  guestToRemove = guest;
                  break;
              }
          }
          guestSet.remove(guestToRemove);
      }   else {
          throw new RuntimeException("The set is empty!");
      }
  }
  public int countGuests() {
      return guestSet.size();
  }

  public void showGuests() {
      if (!guestSet.isEmpty()) {
         System.out.println(guestSet);
     }   else {
         System.out.println("The set is empty!");
     }

  }

  public static void main(String[] args) {
    //creating an instance of the guestsset class
    GuestsSet guestsSet = new GuestsSet();

    //showing the number of guests in the set (could be zero)
    System.out.println("There are " + guestsSet.countGuests() + " guest(s) inside the guests set" );

    //adding the guests to the set
    guestsSet.addGuest("Alice", 1234);
    guestsSet.addGuest("Bob", 1235);
    guestsSet.addGuest("Charlie", 1235);
    guestsSet.addGuest("David", 1236);

    //showing the guests in the set
    System.out.println("Guests in the set:");
    guestsSet.showGuests();

    //removing the guest of set by invite code
    guestsSet.removeGuestByInviteCode(1234);
    System.out.println("There are " + guestsSet.countGuests() + " guest(s) inside the guests set after the removal");

    //showing the number of updated guests in the set
    System.out.println("Guests in the set after removal:");
    guestsSet.showGuests();
  }
}
