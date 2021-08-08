import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MultiDieConstuctorTest {

    MultiDie multiDie = new MultiDie();
    DieConstuctor testDieConstuctor = new DieConstuctor();


    @Test
    void createTest() {
        Integer expectedNumOfSides = 6;

        testDieConstuctor = multiDie.create(expectedNumOfSides);
        Integer actualNumOfSides = testDieConstuctor.getNumberOfSides();


        Assertions.assertEquals(expectedNumOfSides, actualNumOfSides);
        Assertions.assertEquals(String.class.getName(), String.class.getName());
    }

    @Test
    void findAll() {
        Integer d20 = 20;

        testDieConstuctor = multiDie.create(d20);

        List<DieConstuctor> testList = new ArrayList<>();
        testList.add(testDieConstuctor);
        int [] actual = testList.stream().mapToInt(DieConstuctor::getNumberOfSides).toArray();

        int[] expected = multiDie.findAll();
        //IntStream expected = expectedList.stream().mapToInt(DieConstuctor::getNumberOfSides);

        System.out.println(actual[0]);

        Assertions.assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }

    @Test
    void delete() {
        Integer d4 = 4;

        testDieConstuctor = multiDie.create(d4);

        Boolean actual = multiDie.delete();

        Assertions.assertTrue(actual);
    }
}