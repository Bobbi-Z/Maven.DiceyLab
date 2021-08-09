import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BinsMapTest {

    @Test
    void createTest() { //test case will be for D6
        Bins testBin = new Bins(1, 6);
        Map<Integer, Integer> expectedMap = new LinkedHashMap<>();
        expectedMap.put(1, 0);
        expectedMap.put(2, 0);
        expectedMap.put(3,0);
        expectedMap.put(4,0);
        expectedMap.put(5,0);
        expectedMap.put(6,0);
        
        Map<Integer, Integer> actualMap = BinsMap.create(testBin);

        Assertions.assertEquals(expectedMap, actualMap);
        System.out.println(expectedMap);
        System.out.println(actualMap);

    }

    @Test
    void showAll() {
        Bins testBin = new Bins(2, 10);
        Map<Integer, Integer> actualMap = BinsMap.create(testBin);
        String expected = "{2=0, 3=0, 4=0, 5=0, 6=0, 7=0, 8=0, 9=0, 10=0}";
        String actual = actualMap.toString();
        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);

    }

    @Test
    void findSpecific() {
        Bins testBin = new Bins(2, 10);
        Map<Integer, Integer> actualMap = BinsMap.create(testBin);
        Integer givenKey = 6;
        String expected = "0";
        String actual = actualMap.get(givenKey).toString();
        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    void updateWholeMap() {
        Dice testDice = new Dice();
        Bins testBin = new Bins(2, 12);
        Map<Integer, Integer> actualMap = BinsMap.create(testBin);
    }

    @Test
    void updateSingleEntry() {
    }
}