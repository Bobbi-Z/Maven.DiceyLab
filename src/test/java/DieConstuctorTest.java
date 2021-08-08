import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DieConstuctorTest {

    DieConstuctor dieConstuctor = new DieConstuctor();

    @Test
    void constructorTest() {
        Integer givenSides = 20;
        String name = "d20";
        dieConstuctor = new DieConstuctor(name, givenSides);
        Assertions.assertEquals(givenSides, dieConstuctor.getNumberOfSides());
        Assertions.assertEquals(name, dieConstuctor.getName());
    }

    @Test
    void setNumberOfSidesTest() {
        Integer givenNumSides = 6;
        dieConstuctor.setNumberOfSides(givenNumSides);
        Integer actualNumOfSides = dieConstuctor.getNumberOfSides();
        Assertions.assertEquals(givenNumSides, actualNumOfSides);
    }
}