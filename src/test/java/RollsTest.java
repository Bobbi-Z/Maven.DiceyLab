import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.Map;

class RollsTest {
    EnumMap<Die, Integer> testMap = DieMap.creatingTheMap();
    @BeforeAll
    static void setTestMap() {
        EnumMap<Die, Integer> testMap = DieMap.creatingTheMap();
        for (Map.Entry<Die, Integer> entry : testMap.entrySet()) {
            Die key = entry.getKey();
            DieMap.increasingValue(key);
        }

    }


    @Test
    void rollD4Test(){
        int countNumberOfRolls = 0;
       Dice dice = new Dice(1, 4);

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(dice);
            if (result < 1 || result > 4){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollD6Test() {
        int countNumberOfRolls = 0;
        Dice dice = new Dice(1, 6);

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(dice);
            if (result < 1 || result > 6){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }

    }

    @Test
    void rollD8Test(){
        int countNumberOfRolls = 0;
        Dice dice = new Dice(1, 8);

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(dice);
            if (result < 1 || result > 8){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollD10Test(){
        int countNumberOfRolls = 0;
        Dice dice = new Dice(1, 10);

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(dice);
            if (result < 1 || result > 10){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollD12Test(){
        int countNumberOfRolls = 0;
        Dice dice = new Dice(1, 4);

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(dice);
            if (result < 1 || result > 12){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollD20Test(){
        int countNumberOfRolls = 0;
        Dice dice = new Dice(1, 20);

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(dice);
            if (result < 1 || result > 20){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollD100Test(){
        int countNumberOfRolls = 0;
        Dice dice = new Dice(1, 100);

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(dice);
            if (result < 1 || result > 100){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollNTimesTest() {
        Dice dice = new Dice(5, 100);
        Integer expected = Rolls.rollNTimes(dice);
        if (expected < dice.getNumberOfDie() || expected > (dice.getNumberOfSides() * dice.getNumberOfDie())){
            Assertions.fail();
        }
        System.out.println(expected);
        System.out.println(dice.getNumberOfDie());
        System.out.println(dice.getNumberOfSides());
        System.out.println(dice.getNumberOfSides() * dice.getNumberOfDie());
    }


    @Test
    void rollMapDieTest() {
        EnumMap<Die, Integer> testMap = DieMap.creatingTheMap();
        for (Map.Entry<Die, Integer> entry : testMap.entrySet()) {
            Die key = entry.getKey();
            DieMap.increasingValue(key);
        }

        Integer totalNumberOfDie = 0;
        Integer upperBound = 0;
        Integer loopsThroughMap = 0;
        while (loopsThroughMap < testMap.size()) {
        for (Map.Entry<Die, Integer> entry : testMap.entrySet()) {
            Die key = entry.getKey();
            Integer numberOfDie = entry.getValue();
            Integer numberOFSide = key.getNumberOfSidesForEnum();
            Integer bound = numberOFSide * numberOfDie;
            totalNumberOfDie += numberOfDie;
            upperBound += bound;
            }

            loopsThroughMap++;
        }
        Integer actual = Rolls.rollMapDie(testMap);

        if (actual < totalNumberOfDie|| actual > upperBound){
            Assertions.fail();
        }
        System.out.println(totalNumberOfDie);
        System.out.println(upperBound);
        System.out.println(actual);
        System.out.println(testMap);

    }
}