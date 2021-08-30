import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;




class BinsMapTest {



    @Test
    void createTest() { //test case will be for D6
        Bins testBin = new Bins(1, 6);

        LinkedHashMap<Integer, Integer> expectedMap = new LinkedHashMap<>();
        expectedMap.put(1, 0);
        expectedMap.put(2, 0);
        expectedMap.put(3,0);
        expectedMap.put(4,0);
        expectedMap.put(5,0);
        expectedMap.put(6,0);

        BinsMap binsMap = new BinsMap();
        LinkedHashMap<Integer, Integer> actualMap = binsMap.create(testBin);

        Assertions.assertEquals(expectedMap, actualMap);
        System.out.println(expectedMap);
        System.out.println(actualMap);

        actualMap.clear();

    }

    @Test
    void showAllTest() {
        Bins testBin = new Bins(2, 12);
        BinsMap binsMap = new BinsMap();
                binsMap.create(testBin);
        String expected = "{2=0, 3=0, 4=0, 5=0, 6=0, 7=0, 8=0, 9=0, 10=0, 11=0, 12=0}";
        String actual = binsMap.showAll();
        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
      BinsMap.clearMap();
    }

    @Test
    void findSpecificTest() {
        Bins testBin = new Bins(2, 12);
        BinsMap testBinsMap = new BinsMap();
                testBinsMap.create(testBin);
        Integer givenKey = 6;
        String expected = "0";
        String actual = testBinsMap.findSpecific(givenKey);
        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
        BinsMap.clearMap();
    }

    @Test
    void updateWholeMapTest() {
        Bins testBin = new Bins(1, 6);
       BinsMap binsMap = new BinsMap();
         binsMap.create(testBin);
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(6);

       Boolean actual = binsMap.updateWholeMap(testList);

        Assertions.assertTrue(actual);
        BinsMap.clearMap();

    }

    @Test
    void updateSingleEntryTest() {
        Integer givenNumberRolled = 2;
        Bins testBin = new Bins(1, 6);
        BinsMap testBinsMap = new BinsMap();
        testBinsMap.create(testBin);
        Boolean actual = testBinsMap.updateSingleEntry(givenNumberRolled);
        Assertions.assertTrue(actual);
        BinsMap.clearMap();
    }

    @Test
    void clearMapTest() {
        Bins testBins = new Bins(2, 12);
        BinsMap testMap = new BinsMap();
        testMap.create(testBins);
        Boolean actual = testMap.clearMap();
        Assertions.assertTrue(actual);
    }

    @Test
    void settingValuesToZeroTest() {
        Bins testBins = new Bins(2, 12);
        BinsMap testMap = new BinsMap();
        testMap.create(testBins);
        Boolean actual = testMap.settingValuesToZero();
        Assertions.assertTrue(actual);
        BinsMap.clearMap();

    }
}