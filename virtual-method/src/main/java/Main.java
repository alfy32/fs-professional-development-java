import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Alan Christensen
 * 12/18/2014
 */
public class Main {
  public static void main(String[] args) throws IOException {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Cat());
    animals.add(new Cat());
    animals.add(new Dog());
    animals.add(new Dog());
    animals.add(new Cow());
    animals.add(new Cow());
    animals.add(new Dog());
    animals.add(new Cow());
    animals.add(new Cat());

    System.out.println("The animals will now say hi....");
    System.out.println();

    for (Animal animal : animals) {
      animal.sayHi();
    }

    System.out.println();
    System.out.println("They all said different things...cool!");
  }
}
