import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.Map;

class DieMapTest {


     EnumMap<Die, Integer> testMap = DieMap.creatingTheMap();


    @Test
    void creatingTheMapTest() {
        EnumMap<Die, Integer> testMap2 = new EnumMap<>(Die.class);
        testMap2.putAll(DieMap.howManyToRoll);

        System.out.println(testMap2);
        System.out.println(testMap);

        Assertions.assertEquals(testMap2.toString(), testMap.toString());

    }

    @Test
    void increasingD4ValueTest() {
        Die input = Die.D4;
       Assertions.assertTrue(DieMap.increasingValue(input));
    }

    @Test
    void increasingD6ValueTest() {
        Die input = Die.D6;
        Assertions.assertTrue(DieMap.increasingValue(input));
    }

    @Test
    void increasingD8ValueTest() {
        Die input = Die.D8;
        Assertions.assertTrue(DieMap.increasingValue(input));
    }

    @Test
    void increasingD10ValueTest() {
        Die input = Die.D10;
        Assertions.assertTrue(DieMap.increasingValue(input));
    }

    @Test
    void increasingD12ValueTest() {
        Die input = Die.D12;
        Assertions.assertTrue(DieMap.increasingValue(input));
    }

    @Test
    void increasingD20ValueTest() {
        Die input = Die.D20;
        Assertions.assertTrue(DieMap.increasingValue(input));
    }

    @Test
    void increasingD100ValueTest() {
        Die input = Die.D100;
        Assertions.assertTrue(DieMap.increasingValue(input));
    }

    @Test
    void decreasingD4ValueTest() {
        Die input = Die.D4;
        DieMap.increasingValue(input);
        Assertions.assertTrue(DieMap.decreasingValue(input));
    }

    @Test
    void decreasingD6ValueTest() {
        Die input = Die.D6;
        DieMap.increasingValue(input);
        Assertions.assertTrue(DieMap.decreasingValue(input));
    }

    @Test
    void decreasingD8ValueTest() {
        Die input = Die.D8;
        DieMap.increasingValue(input);
        Assertions.assertTrue(DieMap.decreasingValue(input));
    }

    @Test
    void decreasingD10ValueTest() {
        Die input = Die.D10;
        DieMap.increasingValue(input);
        Assertions.assertTrue(DieMap.decreasingValue(input));
    }

    @Test
    void decreasingD12ValueTest() {
        Die input = Die.D12;
        DieMap.increasingValue(input);
        Assertions.assertTrue(DieMap.decreasingValue(input));
    }

    @Test
    void decreasingD20ValueTest() {
        Die input = Die.D20;
        DieMap.increasingValue(input);
        Assertions.assertTrue(DieMap.decreasingValue(input));
    }

    @Test
    void decreasingD100ValueTest() {
        Die input = Die.D100;
        DieMap.increasingValue(input);
        Assertions.assertTrue(DieMap.decreasingValue(input));
    }

    @Test
    void settingBackTo0Test() {
        for (Map.Entry<Die, Integer> entry : testMap.entrySet()){
            Die key = entry.getKey();
            DieMap.increasingValue(key);
        }
       Assertions.assertTrue(DieMap.settingBackTo0());
    }

    @Test
    void entrySetTest() {
        String expected = testMap.entrySet().toString();
        String actual = DieMap.entrySet().toString();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    void sizeTest() {
        Integer expected = 7;
        Integer actual = testMap.size();
        Assertions.assertEquals(expected, actual);
    }


}