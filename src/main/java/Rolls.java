import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Rolls {//the random number generator to simulate die rolls

    public static Integer rollDie(Dice dice){ // takes an argument of dice only to use the number of sides
       Integer numberOfSides =  dice.getNumberOfSides();
      Integer rollDieResults = ThreadLocalRandom.current().nextInt(1, numberOfSides+1);
        RollDieContainer.collectDataFromRollDie(dice, rollDieResults);
        return rollDieResults;
    }





    public static Integer rollNTimes(Dice dice){ //takes an argument of dice to use the number of die to ensure the roll die function
        // is called the correct amount of time while passing the number of sides the dice have to the rolldie function
        Integer rollNTimesResults = 0;
       Integer numberOfDieToRoll = dice.getNumberOfDie();
        Integer rollCount = 0;
        while (rollCount < numberOfDieToRoll){
           Integer rollDieResults = rollDie(dice);
            rollNTimesResults += rollDieResults;
            rollCount++;
        }

        return rollNTimesResults;
    }

    public static Integer rollMapDie(EnumMap<Die, Integer> dieMap){ //for large rolls or rolls with multiple kinds of
        // die breaks the enum map up into key value pairs and feeds them individually as instances of dice to the rollNtimes
        // method that send the sides the chosen die to the rolldie function.

        Integer rollMapDieResults = 0;
        Integer mapEntryCounts = 0;
        while (mapEntryCounts < dieMap.size()) {
        for (Map.Entry<Die, Integer> entry : dieMap.entrySet()) {
            Die key = entry.getKey();
           Integer numberOfDieToRoll = entry.getValue();
            Integer numberOfSides = key.getNumberOfSidesForEnum();
            Dice dice = new Dice(numberOfDieToRoll, Die.D6);
            Integer rollNTimesResults = rollNTimes(dice);
                rollMapDieResults += rollNTimesResults;
                mapEntryCounts++;
            }
        }
            return rollMapDieResults;
    }




}
