import sun.awt.image.ImageWatched;

import java.util.LinkedHashMap;
import java.util.List;

public class MapOfBins {

    static LinkedHashMap<Bins, List<Integer>> mapOfAllBins = new LinkedHashMap<>();

    public static LinkedHashMap<Bins, List<Integer>> createMapOfBins(Bins bin, List<Integer> resultsLists){
        mapOfAllBins.put(bin, resultsLists);
return null;
    }



}
