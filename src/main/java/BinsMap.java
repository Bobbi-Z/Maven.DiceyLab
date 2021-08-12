import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BinsMap { // tallying the results by creating a map where the keys are the possible results retrieved from
    // the min and max of a bin and running a list through a method to increase the value of the key if that number is
    // rolled

   static Map<Integer, Integer> resultsMap = new LinkedHashMap<>();

    public static Map<Integer, Integer> create(Bins bins){ //<result, numberOfTimesRolled>
        //use bins to create keys //use list to update values
        Integer min = bins.getMin(); //given the bin use the min to start making the keys
        Integer max = bins.getMax();//using the bin max to be the last key
        Integer index; // index of the value in a "list" of numbers that we're "creating" using the min and max values
        // from the bin will equal the key entry
        Integer defaultValue = 0; // the default value for each key will be zero until we run the list of roll results through
            for (index = min; index <= max; index++){ //iterating through a "list" created by the min and max of the bin
                resultsMap.put(index, defaultValue); //adding the min through max values as keys with the default value for a complete entry
            }
            return resultsMap; //returning the resulting map
    }

    public String showAll(){ //will show the whole map represented as a string
        return resultsMap.toString();
    }

    public String findSpecific(Integer numberRolled){ //give the key or number rolled this will return the number of times it was rolled
        return resultsMap.get(numberRolled).toString();
    }
//will find the number of times that number has been rolled



    public static Boolean updateWholeMap(List<Integer> integerList){ //once we have a list of results
        for (Integer rollResult : integerList){ //we take each element of the list
            if (resultsMap.containsKey(rollResult)){ //check to see if the map has this element as a key
               Integer oldMapValue = resultsMap.get(rollResult); //if so return te value of that key
               Integer newMapValue = oldMapValue + 1; //increase the value of the key by one as the element counts as a tally for this key
               resultsMap.replace(rollResult, oldMapValue, newMapValue); //replace the old value with the new value
                return resultsMap.get(rollResult).equals(newMapValue); // check to be sure the current value of the
                // element is equal to the calculated new value = if true return true
            }

        }
            return false;
    }

    public static Boolean updateSingleEntry(Integer numberRolled){ //taking a single roll result and updating the map
        if (resultsMap.containsKey(numberRolled)) {
            Integer oldValue = resultsMap.get(numberRolled);
            Integer newValue = oldValue + 1;
            resultsMap.replace(numberRolled, oldValue, newValue);
            return resultsMap.get(numberRolled).equals(newValue);
        }
        return false;
    }

    public static Boolean clearMap(BinsMap binsMap){ //completely empties a bins map
        resultsMap.clear();
        return resultsMap.isEmpty();
    }

    public static Boolean settingValuesToZero(){ // instead of clearing the map set all the values back to 0
        resultsMap.replaceAll((k, v) -> v = 0);

        return null;
    }


}


