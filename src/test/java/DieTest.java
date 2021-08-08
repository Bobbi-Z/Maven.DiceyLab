import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    Die die = new Die();

    @Test
    void constructorTest() {
        Integer givenSides = 20;
        String name = "d20";
        die = new Die(name, givenSides);
        Assertions.assertEquals(givenSides, die.getNumberOfSides());
        Assertions.assertEquals(name, die.getName());
    }

    @Test
    void setNumberOfSidesTest() {
        Integer givenNumSides = 6;
        die.setNumberOfSides(givenNumSides);
        Integer actualNumOfSides = die.getNumberOfSides();
        Assertions.assertEquals(givenNumSides, actualNumOfSides);
    }
}