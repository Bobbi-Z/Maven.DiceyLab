import java.util.ArrayList;
import java.util.List;

public class MultiDie {
    //create a list of die (that may have different numbers of sides) to pass through the roll method
    // to simulate rolling many die

    public List<DieConstuctor> dieConstuctorToRoll = new ArrayList<>();
    private static String name = "d";

    public DieConstuctor create(Integer numberOfSides){
       DieConstuctor newlyCreated = new DieConstuctor(name + numberOfSides.toString(), numberOfSides);
        dieConstuctorToRoll.add(newlyCreated);
        return newlyCreated;
    }
    public int[] findAll() {

        return dieConstuctorToRoll.stream().mapToInt(DieConstuctor::getNumberOfSides).toArray();
    }

    public Boolean delete(){
        if(dieConstuctorToRoll.isEmpty()) {
            return false;
        }else {
            dieConstuctorToRoll.remove(0);
            return true;
        }
}



}
