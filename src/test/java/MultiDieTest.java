import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MultiDieTest {

    MultiDie multiDie = new MultiDie();
    Die testDie = new Die();


    @Test
    void createTest() {
        Integer expectedNumOfSides = 6;
        testDie = multiDie.create(expectedNumOfSides);
        Integer actualNumOfSides = testDie.getNumberOfSides();

        Assertions.assertEquals(expectedNumOfSides, actualNumOfSides);
    }

    @Test
    void findAll() {
        Integer d20 = 20;
        testDie = multiDie.create(d20);

        List<Die> testList = new ArrayList<>();
        testList.add(testDie);

        List<Die> expected = multiDie.findAll();

        Assertions.assertEquals(testList, expected);
    }

    @Test
    void delete() {
        Integer d4 = 4;
        testDie = multiDie.create(d4);

        Boolean actual = multiDie.delete();

        Assertions.assertTrue(actual);
    }
}