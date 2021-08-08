import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    Die die = new Die();

    @Test
    void constructorTest() {
        Integer givenSides = 20;
        die = new Die(givenSides);
        Assertions.assertEquals(givenSides, die.getNumberOfSides());
    }

    @Test
    void setNumberOfSidesTest() {
        Integer givenNumSides = 6;
        die.setNumberOfSides(givenNumSides);
        Integer actualNumOfSides = die.getNumberOfSides();
        Assertions.assertEquals(givenNumSides, actualNumOfSides);
    }
}