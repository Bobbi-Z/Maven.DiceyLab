import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RollDieContainerTest {





    @Test
    void collectDataFromRollDieTestD6() {
        RollDieContainer rDc = mock(RollDieContainer.class);
        rDc.collectDataFromRollDie(1, 5);
        verify(rDc, times(1)).collectDataFromRollDie(1, 5);

    }

    @Test
    void createD4BinTest() {
        Integer givenNumberOfSides = 4;
        Bins expected = new Bins(1, 4);
        String expectedS = Bins.toString(expected);
        Bins actual = RollDieContainer.createD4Bin(givenNumberOfSides);
        String actualS = Bins.toString(actual);
        Assertions.assertEquals(expectedS, actualS);
    }

    @Test
    void resultsFromD4() {
        Integer rollD4 = 4;
        List<Integer> testList = new ArrayList<>();
        testList.add(4);
        List<Integer> test = RollDieContainer.resultsFromD4(rollD4);
        String expected = testList.toString();
        String actual = test.toString();
        Assertions.assertEquals(expected, actual);
        testList.clear();
        test.clear();


    }

    @Test
    void createD6Bin() {
        Integer givenNumberOfSides = 6;
        Bins expected = new Bins(1, 6);
        String expectedS = Bins.toString(expected);
        Bins actual = RollDieContainer.createD4Bin(givenNumberOfSides);
        String actualS = Bins.toString(actual);
        Assertions.assertEquals(expectedS, actualS);
    }

    @Test
    void resultsFromD6() {
        Integer rollD6 = 6;
        List<Integer> testList = new ArrayList<>();
        testList.add(6);
        List<Integer> test = RollDieContainer.resultsFromD4(rollD6);
        String expected = testList.toString();
        String actual = test.toString();
        Assertions.assertEquals(expected, actual);
        testList.clear();
        test.clear();
    }

    @Test
    void createD8Bin() {
        Integer givenNumberOfSides = 8;
        Bins expected = new Bins(1, 8);
        String expectedS = Bins.toString(expected);
        Bins actual = RollDieContainer.createD4Bin(givenNumberOfSides);
        String actualS = Bins.toString(actual);
        Assertions.assertEquals(expectedS, actualS);
    }

    @Test
    void resultsFromD8() {
        Integer rollD8 = 8;
        List<Integer> testList = new ArrayList<>();
        testList.add(8);
        List<Integer> test = RollDieContainer.resultsFromD4(rollD8);
        String expected = testList.toString();
        String actual = test.toString();
        Assertions.assertEquals(expected, actual);
        testList.clear();
        test.clear();
    }

    @Test
    void createD10Bin() {
        Integer givenNumberOfSides = 10;
        Bins expected = new Bins(1, 10);
        String expectedS = Bins.toString(expected);
        Bins actual = RollDieContainer.createD4Bin(givenNumberOfSides);
        String actualS = Bins.toString(actual);
        Assertions.assertEquals(expectedS, actualS);

    }

    @Test
    void resultsFromD10() {
        Integer rollD10 = 10;
        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        List<Integer> test = RollDieContainer.resultsFromD4(rollD10);
        String expected = testList.toString();
        String actual = test.toString();
        Assertions.assertEquals(expected, actual);
        testList.clear();
        test.clear();
    }

    @Test
    void createD12Bin() {
        Integer givenNumberOfSides = 12;
        Bins expected = new Bins(1, 12);
        String expectedS = Bins.toString(expected);
        Bins actual = RollDieContainer.createD4Bin(givenNumberOfSides);
        String actualS = Bins.toString(actual);
        Assertions.assertEquals(expectedS, actualS);
    }

    @Test
    void resultsFromD12() {
        Integer rollD12 = 12;
        List<Integer> testList = new ArrayList<>();
        testList.add(12);
        List<Integer> test = RollDieContainer.resultsFromD4(rollD12);
        String expected = testList.toString();
        String actual = test.toString();
        Assertions.assertEquals(expected, actual);
        testList.clear();
        test.clear();
    }

    @Test
    void createD20Bin() {
        Integer givenNumberOfSides = 20;
        Bins expected = new Bins(1, 20);
        String expectedS = Bins.toString(expected);
        Bins actual = RollDieContainer.createD4Bin(givenNumberOfSides);
        String actualS = Bins.toString(actual);
        Assertions.assertEquals(expectedS, actualS);
    }

    @Test
    void resultsFromD20() {
        Integer rollD20 = 20;
        List<Integer> testList = new ArrayList<>();
        testList.add(20);
        List<Integer> test = RollDieContainer.resultsFromD4(rollD20);
        String expected = testList.toString();
        String actual = test.toString();
        Assertions.assertEquals(expected, actual);
        testList.clear();
        test.clear();
    }

    @Test
    void createD100Bin() {
        Integer givenNumberOfSides = 100;
        Bins expected = new Bins(1, 100);
        String expectedS = Bins.toString(expected);
        Bins actual = RollDieContainer.createD4Bin(givenNumberOfSides);
        String actualS = Bins.toString(actual);
        Assertions.assertEquals(expectedS, actualS);
    }

    @Test
    void resultsFromD100() {
        Integer rollD100 = 100;
        List<Integer> testList = new ArrayList<>();
        testList.add(100);
        List<Integer> test = RollDieContainer.resultsFromD4(rollD100);
        String expected = testList.toString();
        String actual = test.toString();
        Assertions.assertEquals(expected, actual);
        testList.clear();
        test.clear();
    }
}