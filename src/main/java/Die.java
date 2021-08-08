public class Die { //create instances of a die with n sides

    private Integer numberOfSides;

    public Die() {

    }

    public Die(Integer numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public Integer getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(Integer numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
