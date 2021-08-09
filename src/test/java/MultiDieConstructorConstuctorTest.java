import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MultiDieConstructorConstuctorTest {

    MultiDieConstructor multiDieConstructor = new MultiDieConstructor();
    DieConstuctor testDieConstuctor = new DieConstuctor();


    @Test
    void createTest() {
        Integer expectedNumOfSides = 6;

        testDieConstuctor = multiDieConstructor.create(expectedNumOfSides);
        Integer actualNumOfSides = testDieConstuctor.getNumberOfSides();


        Assertions.assertEquals(expectedNumOfSides, actualNumOfSides);
        Assertions.assertEquals(String.class.getName(), String.class.getName());
    }

    @Test
    void findAll() {
        Integer d20 = 20;

        testDieConstuctor = multiDieConstructor.create(d20);

        List<DieConstuctor> testList = new ArrayList<>();
        testList.add(testDieConstuctor);
        int [] actual = testList.stream().mapToInt(DieConstuctor::getNumberOfSides).toArray();

        int[] expected = multiDieConstructor.findAll();
        //IntStream expected = expectedList.stream().mapToInt(DieConstuctor::getNumberOfSides);

        System.out.println(actual[0]);

        Assertions.assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }

    @Test
    void delete() {
        Integer d4 = 4;

        testDieConstuctor = multiDieConstructor.create(d4);

        Boolean actual = multiDieConstructor.delete();

        Assertions.assertTrue(actual);
    }
}