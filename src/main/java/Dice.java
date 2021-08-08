public class Dice { //create instances of n die with the same n of sides

    private Integer numberOfDie;
    private Integer numberOfSides;

    public Dice() {

    }

    public Dice(Integer numberOfDie, Integer numberOfSides){
        setNumberOfDie(numberOfDie);
        setNumberOfSides(numberOfSides);
    }

    public Integer getNumberOfDie(){
        return numberOfDie;
    }

    public void setNumberOfDie(Integer numberOfDie){
        this.numberOfDie = numberOfDie;
    }

    public Integer getNumberOfSides(){
        return numberOfSides;
    }

    public void setNumberOfSides(Integer numberOfSides){
        this.numberOfSides = numberOfSides;
    }

}
