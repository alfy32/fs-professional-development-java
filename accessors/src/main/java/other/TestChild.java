package other;

/**
 * Author: Alan Christensen
 * 12/19/2014
 */
public class TestChild extends Test {
  public TestChild() {
    // I need a setter to set this value since it is private.
    this.setPrivateValue("Private Value");

    // I can set this because I am a child class of(extending) other.Test
    this.protectedValue = "Protected Value";

    // Anyone can edit this value directly
    this.publicValue = "Public Value";
  }
}
