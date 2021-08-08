import java.util.concurrent.ThreadLocalRandom;

public class Rolls { //the random number generator to simulate die rolls

    public static Integer rollDie(Integer numberOfSides){

        return ThreadLocalRandom.current().nextInt(1, numberOfSides+1);
    }





}
