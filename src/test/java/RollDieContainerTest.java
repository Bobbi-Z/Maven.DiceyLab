import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RollDieContainerTest {





    @Test
    void collectDataFromRollDieTestD6() {
        Dice diceTest = new Dice(1, Die.D6);
        RollDieContainer rDc = mock(RollDieContainer.class);
        rDc.collectDataFromRollDie(diceTest, 5);
        verify(rDc, times(1)).collectDataFromRollDie(diceTest, 5);

    }


    @Test
    void resultsFromD4Test() {
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
    void resultsFromD6Test() {
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
    void resultsFromD8Test() {
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
    void resultsFromD10Test() {
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
    void resultsFromD12Test() {
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
    void resultsFromD20Test() {
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
    void resultsFromD100Test() {
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

    @Test
    void createD4BinTest() {
        Dice D4 = new Dice(1, Die.D4);
        Bins actual = RollDieContainer.createD4Bin(D4);
        String actualS = Bins.toString(actual);
        String expected = "Bins{min=1, max=4}";
        System.out.println(Bins.toString(actual));
        Assertions.assertEquals(expected, actualS);
    }

    @Test
    void createD6BinTest() {
        Dice D6 = new Dice(1, Die.D6);
        Bins actual = RollDieContainer.createD6Bin(D6);
        String actualS = Bins.toString(actual);
        String expected = "Bins{min=1, max=6}";
        System.out.println(Bins.toString(actual));
        Assertions.assertEquals(expected, actualS);
    }

    @Test
    void createD8BinTest() {
        Dice D8 = new Dice(1, Die.D8);
        Bins actual = RollDieContainer.createD8Bin(D8);
        String actualS = Bins.toString(actual);
        String expected = "Bins{min=1, max=8}";
        System.out.println(Bins.toString(actual));
        Assertions.assertEquals(expected, actualS);
    }

    @Test
    void createD10BinTest() {
        Dice D10 = new Dice(1, Die.D10);
        Bins actual = RollDieContainer.createD10Bin(D10);
        String actualS = Bins.toString(actual);
        String expected = "Bins{min=1, max=10}";
        System.out.println(Bins.toString(actual));
        Assertions.assertEquals(expected, actualS);
    }

    @Test
    void createD12BinTest() {
        Dice D12 = new Dice(1, Die.D12);
        Bins actual = RollDieContainer.createD12Bin(D12);
        String actualS = Bins.toString(actual);
        String expected = "Bins{min=1, max=12}";
        System.out.println(Bins.toString(actual));
        Assertions.assertEquals(expected, actualS);
    }

    @Test
    void createD20BinTest() {
        Dice D20 = new Dice(1, Die.D20);
        Bins actual = RollDieContainer.createD20Bin(D20);
        String actualS = Bins.toString(actual);
        String expected = "Bins{min=1, max=20}";
        System.out.println(Bins.toString(actual));
        Assertions.assertEquals(expected, actualS);
    }

    @Test
    void createD100BinTest() {
        Dice D100 = new Dice(1, Die.D100);
        Bins actual = RollDieContainer.createD100Bin(D100);
        String actualS = Bins.toString(actual);
        String expected = "Bins{min=1, max=100}";
        System.out.println(Bins.toString(actual));
        Assertions.assertEquals(expected, actualS);
    }
}