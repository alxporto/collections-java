package main.java.set.basicoperations;

import java.util.Objects;
public class Guest {
  //attributes
  private int inviteCode;
  private String name;

  public Guest(String name, int inviteCode) {
      this.inviteCode = inviteCode;
      this.name = name;
  }
  public String getName() {
      return name;
  }
  public int getInviteCode() {
      return inviteCode;
  }

  @Override
  public boolean equals(Object object) {
      if (this == object) return true;
      if (!(object instanceof Guest guest)) return false;
      return getInviteCode() == guest.getInviteCode();
  }

  @Override
  public int hashCode() {
      return Objects.hash(getInviteCode());
  }

  @Override
  public String toString() {
      return "Guest{" +
              "inviteCode=" + inviteCode +
              ", name='" + name + '\'' +
              '}';
  }
}
