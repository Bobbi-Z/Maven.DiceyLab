import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class MultiDieTest {

    MultiDie multiDie = new MultiDie();
    Die testDie = new Die();


    @Test
    void createTest() {
        Integer expectedNumOfSides = 6;

        testDie = multiDie.create(expectedNumOfSides);
        Integer actualNumOfSides = testDie.getNumberOfSides();


        Assertions.assertEquals(expectedNumOfSides, actualNumOfSides);
        Assertions.assertEquals(String.class.getName(), String.class.getName());
    }

    @Test
    void findAll() {
        Integer d20 = 20;

        testDie = multiDie.create(d20);

        List<Die> testList = new ArrayList<>();
        testList.add(testDie);
        int [] actual = testList.stream().mapToInt(Die::getNumberOfSides).toArray();

        int[] expected = multiDie.findAll();
        //IntStream expected = expectedList.stream().mapToInt(Die::getNumberOfSides);

        System.out.println(actual[0]);

        Assertions.assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }

    @Test
    void delete() {
        Integer d4 = 4;

        testDie = multiDie.create(d4);

        Boolean actual = multiDie.delete();

        Assertions.assertTrue(actual);
    }
}