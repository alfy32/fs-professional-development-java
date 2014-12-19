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
    animals.add(new Dog());
    animals.add(new Cat());

    System.out.println("The animals will now say hi....");
    System.out.println();

    for (Animal animal : animals) {
      // This one is a cat
      if (animal instanceof Cat) {
        Cat cat = (Cat) animal;
        cat.sayHi();
      }
      // This one is a dog
      else if (animal instanceof Dog) {
        Dog dog = (Dog) animal;
        dog.sayHi();
      }
    }

    System.out.println();
    System.out.println("They all said different things...cool!");
  }
}
