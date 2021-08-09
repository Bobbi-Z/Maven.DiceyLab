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
    void rollNTimesTest() { //this is testing that given this instance of dice the rollNTimes method returns a result within the bounds of possible results.
        Dice dice = new Dice(5, 6);
        Integer resultsFromRollNTimes = Rolls.rollNTimes(dice);
        if (resultsFromRollNTimes < 5 || resultsFromRollNTimes > (5 * 6)){ //the resultsFromRollNTimes results cannot be less than the number of die because at the minimum each die can roll a 1
            //also the resultsFromRollNTimes results cannot exceed the number of die times the number of sides because the number of sides is also the max number that can be
            // rolled this number is if each die rolls its highest value
            Assertions.fail();
        }
        System.out.println("rollNTimesTest sout printouts ");
        System.out.println("results = " + resultsFromRollNTimes);
        System.out.println("number of die AND lower bound (should be 5) = " + dice.getNumberOfDie());
        System.out.println("number of sides (should be 6) = " + dice.getNumberOfSides());
        System.out.println("this is upper bound i.e. number of die * number of sides (should be 30) = " + (dice.getNumberOfSides() * dice.getNumberOfDie()));

    }


    @Test
    void rollMapDieTest() {// this tests the given a map of die the rollMapDie method returns a value within the bounds of possible results
        EnumMap<Die, Integer> testMap = DieMap.creatingTheMap(); //creating the test map
        testMap.replace(Die.D4, 7);
        testMap.replace(Die.D6, 6);
        testMap.replace(Die.D8, 5);
        testMap.replace(Die.D10, 4);
        testMap.replace(Die.D12, 0);
        testMap.replace(Die.D20, 2);
        testMap.replace(Die.D100, 1);

        Integer totalNumberOfDie = 0; //should end at 25
        Integer upperBound = 0;  //should be 284


        for (Map.Entry<Die, Integer> entry : testMap.entrySet()) { //for every entry in the map
            Die key = entry.getKey(); //find the key - which is an enum
            Integer numberOfDie = entry.getValue(); //find the number of die which is the value determined by input within the application
            Integer numberOFSide = key.getNumberOfSidesForEnum(); //use the key (enum) to return the number of sides which is the value stored in the enum
            Integer bound = numberOFSide * numberOfDie; // the bound is the result of all die rolling their max value
            totalNumberOfDie += numberOfDie; //adding up all the die (values) of the map
            upperBound += bound; //the upper bound is all the bounds for each entry added
            }

        Integer resultsOfRollMapDie = Rolls.rollMapDie(testMap); //results of the method

        if (resultsOfRollMapDie < totalNumberOfDie|| resultsOfRollMapDie > upperBound){ //results must always fall between the number of die (if every die rolled a one)
            // and all the bounds for each of the type of die added
            Assertions.fail(); // if it does the test must fail
        }

        System.out.println("rollMapDieTest sout results");
        System.out.println("the # of die = " + totalNumberOfDie);
        System.out.println("the max # = " + upperBound);
        System.out.println("results of the method " + resultsOfRollMapDie);
        System.out.println("the map that was fed into the loop = " + testMap);

    }
}