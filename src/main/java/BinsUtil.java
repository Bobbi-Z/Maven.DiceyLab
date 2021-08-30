import java.util.ArrayList;
import java.util.List;

public class BinsUtil {



    public static Bins creatingABin (Dice dice){
        Bins.setMin(dice);
        Bins.setMax(dice);
        Bins createdBin = new Bins(Bins.getMin(), Bins.getMax());
        return createdBin;
    }

    public static Bins createBinFromDie(Die die){
        Dice dice = new Dice (1, die);
        Bins.setMin(dice);
        Bins.setMax(dice);
        Bins createdBin = new Bins(Bins.getMin(), Bins.getMax());
        return createdBin;
    }






}
