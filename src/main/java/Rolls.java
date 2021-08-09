import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Rolls {//the random number generator to simulate die rolls

    private static Integer numberOfSides;
    private static Integer rollDieResults;
    private static Integer numberOfDieToRoll;




    public static Integer rollDie(Dice dice){
       numberOfSides =  dice.getNumberOfSides();
      rollDieResults = ThreadLocalRandom.current().nextInt(1, numberOfSides+1);
        RollDieContainer.collectDataFromRollDie(numberOfSides, rollDieResults);
        return rollDieResults;
    }





    public static Integer rollNTimes(Dice dice){
        Integer rollNTimesResults = 0;
        numberOfDieToRoll = dice.getNumberOfDie();
        Integer rollCount = 0;
        while (rollCount < numberOfDieToRoll){
            rollDieResults = rollDie(dice);
            rollNTimesResults += rollDieResults;
            rollCount++;
        }

        return rollNTimesResults;
    }

    public static Integer rollMapDie(EnumMap<Die, Integer> dieMap){

        Integer rollMapDieResults = 0;
        Integer mapEntryCounts = 0;
        while (mapEntryCounts < dieMap.size()) {
        for (Map.Entry<Die, Integer> entry : dieMap.entrySet()) {
            Die key = entry.getKey();
            numberOfDieToRoll = entry.getValue();
            numberOfSides = key.getNumberOfSidesForEnum();
            Dice dice = new Dice(numberOfDieToRoll, numberOfSides);
            Integer rollNTimesResults = rollNTimes(dice);
                rollMapDieResults += rollNTimesResults;
                mapEntryCounts++;
            }
        }
            return rollMapDieResults;
    }




}
