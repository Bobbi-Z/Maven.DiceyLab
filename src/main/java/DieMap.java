import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class DieMap {

   public static EnumMap<Die, Integer> howManyToRoll = new EnumMap<>(Die.class);
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

    public static Boolean increasingValue(Die die){
        Integer oldValue = howManyToRoll.get(die);
        Integer newValue = oldValue + 1;
        howManyToRoll.replace(die, oldValue, newValue);
        return newValue.equals(howManyToRoll.get(die));
    }

    public static Boolean decreasingValue(Die die){
        Integer oldValue = howManyToRoll.get(die);
        if(oldValue == 0){
            return false;
        }
        Integer newValue = oldValue - 1;
        howManyToRoll.replace(die, newValue);
        return newValue.equals(howManyToRoll.get(die));
    }

    public static Boolean settingBackTo0(){
        howManyToRoll.replaceAll((key, oldValue) -> 0);
        for (Map.Entry<Die, Integer> entry : howManyToRoll.entrySet()) {
            Integer value = entry.getValue();
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
