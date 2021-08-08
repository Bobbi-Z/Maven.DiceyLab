import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Rolls {//the random number generator to simulate die rolls



    public static Integer rollDie(Dice dice){
       Integer numberOfSides =  dice.getNumberOfSides();
        return ThreadLocalRandom.current().nextInt(1, numberOfSides+1);
    }

    public static Integer rollNTimes(Dice dice){
        Integer results = 0;
        Integer numberOfDieToRoll = dice.getNumberOfDie();
        Integer rollCount = 0;
        while (rollCount < numberOfDieToRoll){
            results = rollDie(dice);
            results += results;
            rollCount++;
        }

        return results;
    }

    public static Integer rollMapDie(EnumMap<Die, Integer> dieMap){

        Integer results = 0;
        Integer dieRollsCounts = 0;
        for (Map.Entry<Die, Integer> entry : dieMap.entrySet()) {
            Die key = entry.getKey();
            Integer numberOfDie = entry.getValue();
            Dice dice = new Dice(numberOfDie, key.getNumberOfSidesForEnum());
            while (dieRollsCounts < dieMap.size()) {
                results = rollNTimes(dice);
                results += results;
                dieRollsCounts++;
            }
        }
            return results;
    }




}
