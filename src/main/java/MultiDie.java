import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MultiDie {
    //create a list of die (that may have different numbers of sides) to pass through the roll method
    // to simulate rolling many die

    public List<Die> dieToRoll = new ArrayList<>();
    private static String name = "d";

    public Die create(Integer numberOfSides){
       Die newlyCreated = new Die(name + numberOfSides.toString(), numberOfSides);
        dieToRoll.add(newlyCreated);
        return newlyCreated;
    }

    public IntStream findAll() {
        return dieToRoll.stream().mapToInt(Die::getNumberOfSides);
    }

    public Boolean delete(){
        if(dieToRoll.isEmpty()) {
            return false;
        }else {
            dieToRoll.remove(0);
            return true;
        }
}


    public void run() {
    }
}
