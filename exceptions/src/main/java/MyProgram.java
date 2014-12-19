/**
 * Author: Alan Christensen
 * 12/18/2014
 */
public class MyProgram {
  public static void main(String[] args) {
    System.out.println("Not sure what to show here...");
    System.out.println();

    System.out.println("This is a checked exception...");
    try {
      throw (new Exception("This is a checked exception"));
    }
    catch (Throwable e) {
      System.out.println("Caught exception. " + e.getMessage());
    }
    System.out.println();

    System.out.println("This is an unchecked exception...");
    try {
      throw (new RuntimeException("This is an unchecked exception"));
    }
    catch (Throwable e) {
      System.out.println("Caught exception. " + e.getMessage());
    }
    System.out.println();

    System.out.println("This is an error exception");
    try {
      throw (new Error("This is an error exception"));
    }
    catch (Throwable t) {
      System.out.println("Caught exception. " + t.getMessage());
    }
  }
}
