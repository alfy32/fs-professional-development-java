/**
 * Author: Alan Christensen
 * 12/19/2014
 */
public class TheClass {
  private Boolean thing1;
  private Integer thing2;
  private String thing3;
  private Double thing4;

  public TheClass(Boolean thing1, Integer thing2, String thing3, Double thing4) {
    this.thing1 = thing1;
    this.thing2 = thing2;
    this.thing3 = thing3;
    this.thing4 = thing4;
  }

  public TheClass(Boolean thing1) {
    this(thing1, null, null, null);
  }

  public TheClass(Integer thing2) {
    this(null, thing2, null, null);
  }

  public TheClass(String thing3) {
    this(null, null, thing3, null);
  }

  public TheClass(Double thing4) {
    this(null, null, null, thing4);
  }

  @Override
  public String toString() {
    return "TheClass: thing1=" + thing1 + " thing2=" + thing2 + " thing3=" + thing3 + " thing4=" + thing4;
  }
}
