import java.io.IOException;

import other.Test;

/**
 * Author: Alan Christensen
 * 12/18/2014
 */
public class Main {
  public static void main(String[] args) throws IOException {

    Test test = new Test();

    // This requires a setter because it is private.
    test.setPrivateValue("Private Value");
    test.privateValue = "Private Value"; // Compile error

    // This requires a setter because it is protected.
    test.setProtectedValue("Protected Value");
    test.protectedValue = "Private Value"; // Compile error

    // This does not require a setter because it is public.
    test.setPublicValue("Public Value");
    test.publicValue = "Public Value"; // NOT compile error

    OtherTest otherTest = new OtherTest();
    otherTest.someProtectedValue = "Value"; // This is allowed because it is the same package.
  }
}
