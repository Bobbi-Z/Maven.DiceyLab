import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    void getD4SidesTest() {
        Integer expected = 4;
        Integer actual = Die.D4.getNumberOfSides();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getD6SidesTest() {
        Integer expected = 6;
        Integer actual = Die.D6.getNumberOfSides();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getD8SidesTest() {
        Integer expected = 8;
        Integer actual = Die.D8.getNumberOfSides();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getD10SidesTest() {
        Integer expected = 10;
        Integer actual = Die.D10.getNumberOfSides();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getD12SidesTest() {
        Integer expected = 12;
        Integer actual = Die.D12.getNumberOfSides();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getD20SidesTest() {
        Integer expected = 20;
        Integer actual = Die.D20.getNumberOfSides();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getD100SidesTest() {
        Integer expected = 100;
        Integer actual = Die.D100.getNumberOfSides();

        Assertions.assertEquals(expected, actual);
    }

}