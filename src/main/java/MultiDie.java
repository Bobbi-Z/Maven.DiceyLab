import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class MultiDie {
    //create a list of die (that may have different numbers of sides) to pass through the roll method
    // to simulate rolling many die

    public List<Die> dieToRoll = new ArrayList<>();

    public Die create(Integer numberOfSides){
       Die newlyCreated = new Die(numberOfSides);
        dieToRoll.add(newlyCreated);
        return newlyCreated;
    }

    public List<Die> findAll() {
        return dieToRoll;
    }

    public Boolean delete(){
        if(dieToRoll.isEmpty()) {
            return false;
        }else {
            dieToRoll.remove(0);
            return true;
        }
}



}
