import java.util.ArrayList;
import java.util.List;

public class BinsList {

    static List<Bins> binsList = new ArrayList<>();

    public static List<Bins> createListOfBins(Bins bins){
        binsList.add(bins);
        return binsList;
    }

    public static Boolean doesTheBinsListContain(Bins bins){
        return binsList.contains(bins);
    }

    public static Boolean clearBinList (){
        binsList.clear();
        return binsList.isEmpty();
    }



}
