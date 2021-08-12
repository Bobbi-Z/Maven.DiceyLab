import java.util.ArrayList;
import java.util.List;

public class Bins { //Bin constructor
//purpose of bins are to display the range of possible options with any roll of any die.

    private Integer min; //smallest number possible - the number of die in the roll
    private Integer max; //largest number possible - the number of die * the number of sides (if there are die
    //  that have different numbers of sides this must be calculated per die.)

    public Bins (){

    }

    public Bins (Integer min, Integer max){ // creating the instance of a bin
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Dice dice) {
        min = dice.getNumberOfDie();
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Dice dice) {
       max = (dice.getNumberOfDie() * dice.getNumberOfSides());
    }



}
