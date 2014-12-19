/**
 * Author: Alan Christensen
 * 12/18/2014
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("This is the All constructor: " + new TheClass(true, 10, "hi", 12.5));
    System.out.println();
    System.out.println("This is the Boolean constructor: " + new TheClass(true));
    System.out.println("This is the Integer constructor: " + new TheClass(10));
    System.out.println("This is the String constructor: " + new TheClass("hi"));
    System.out.println("This is the Double constructor: " + new TheClass(12.5));
  }
}
