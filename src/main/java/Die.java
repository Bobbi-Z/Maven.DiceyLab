import java.util.Objects;

public class Die { //create instances of a die with n sides

    private Integer numberOfSides;
    private String name;

    public Die() {

    }

    public Die(String name, Integer numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.name = name;
    }

    public Integer getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(Integer numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void run() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Die{" +
                "numberOfSides=" + numberOfSides +
                ", name='" + name + '\'' +
                '}';
    }
}
