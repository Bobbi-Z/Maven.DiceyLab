public class Dice { //create instances of n die with the same n of sides

    private static Integer numberOfDie;
    private static Integer numberOfSides;

    public Dice() {

    }

    public Dice(Integer numberOfDie, Integer numberOfSides){
        setNumberOfDie(numberOfDie);
        this.numberOfSides = numberOfSides;
    }

    public static Integer getNumberOfDie(){
        return numberOfDie;
    }

    public void setNumberOfDie(Integer numberOfDie){
        this.numberOfDie = numberOfDie;
    }

    public static Integer getNumberOfSides(){
        return numberOfSides;
    }

    public void setNumberOfSides(Die die){
       numberOfSides = die.getNumberOfSidesForEnum();
    }

}
