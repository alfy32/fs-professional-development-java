import java.util.ArrayList;
import java.util.List;

/**
 * Author: Alan Christensen
 * 12/18/2014
 */
public class Main {
  public static void main(String[] args) {
    List<String> listOfStrings = new ArrayList<>();

    while (true) {
      try {
        listOfStrings.add("A");
      }
      catch (OutOfMemoryError e) {
        break;
      }
    }

    System.out.println("We can put " + listOfStrings.size() + " characters in a string array!");
  }
}
