

import java.util.EnumMap;
import java.util.Map;
public class DieMap { //this will be used to track user input when rolling specific die

   public static EnumMap<Die, Integer> howManyToRoll = new EnumMap<>(Die.class); //enum map to track how many of a specific die to roll
    public static EnumMap<Die, Integer> creatingTheMap(){

        howManyToRoll.put(Die.D4, 0);
        howManyToRoll.put(Die.D6, 0);
        howManyToRoll.put(Die.D8, 0);
        howManyToRoll.put(Die.D10, 0);
        howManyToRoll.put(Die.D12, 0);
        howManyToRoll.put(Die.D20, 0);
        howManyToRoll.put(Die.D100, 0);

        return howManyToRoll;
    }

    public static Boolean increasingValue(Die die){ //method to increase the number of a specific die to roll in a single roll
        Integer oldValue = howManyToRoll.get(die);
        Integer newValue = oldValue + 1;
        howManyToRoll.replace(die, oldValue, newValue);
        return newValue.equals(howManyToRoll.get(die));
    }

    public static Boolean decreasingValue(Die die){ //method to decrease the number of a specific die to roll
        Integer oldValue = howManyToRoll.get(die);
        if(oldValue == 0){
            return false;
        }
        Integer newValue = oldValue - 1;
        howManyToRoll.replace(die, newValue);
        return newValue.equals(howManyToRoll.get(die));
    }

    public static Boolean settingBackTo0(){ //resetting the map to zero after the roll
        howManyToRoll.replaceAll((key, oldValue) -> 0);
        for (Map.Entry<Die, Integer> entry : howManyToRoll.entrySet()) {
            Integer value = entry.getValue();
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public static Iterable<? extends Map.Entry<Die, Integer>> entrySet() { //returns the die and specific number of time to roll it from the map
        return howManyToRoll.entrySet();
    }

    public static Integer size() { //size of the map
        return howManyToRoll.size();
    }
}
