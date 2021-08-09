import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BinsMap { // creating the map bins and results data

   static Map<Integer, Integer> resultsMap = new LinkedHashMap<>();

    public static Map<Integer, Integer> create(Bins bins){ //<result, numberOfTimesRolled>
        //use bins to create keys //use list to update values
        Integer min = bins.getMin();
        Integer max = bins.getMax();
        Integer index;
        Integer defaultInt = 0;
            for (index = min; index <= max; index++){
                resultsMap.put(index, defaultInt);
            }
            return resultsMap;
    }

    public static Boolean updateWholeMap(List<Integer> integerList){
        for (Integer rollResult : integerList){
            if (resultsMap.containsKey(rollResult)){
               Integer oldMapValue = resultsMap.get(rollResult);
               Integer newMapValue = oldMapValue + 1;
               resultsMap.replace(rollResult, oldMapValue, newMapValue);
                return resultsMap.get(rollResult).equals(newMapValue);
            }

        }
            return false;
    }
}


