import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollsTest {



    @Test
    void rollD4Test(){
        int countNumberOfRolls = 0;
        Integer numOfSides = 4;

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(numOfSides);
            if (result < 1 || result > 4){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollD6Test() {
        int countNumberOfRolls = 0;
        Integer numOfSides = 6;

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(numOfSides);
            if (result < 1 || result > 6){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }

    }

    @Test
    void rollD8Test(){
        int countNumberOfRolls = 0;
        Integer numOfSides = 8;

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(numOfSides);
            if (result < 1 || result > 8){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollD10Test(){
        int countNumberOfRolls = 0;
        Integer numOfSides = 10;

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(numOfSides);
            if (result < 1 || result > 10){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollD12Test(){
        int countNumberOfRolls = 0;
        Integer numOfSides = 12;

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(numOfSides);
            if (result < 1 || result > 12){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollD20Test(){
        int countNumberOfRolls = 0;
        Integer numOfSides = 20;

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(numOfSides);
            if (result < 1 || result > 20){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

    @Test
    void rollD100Test(){
        int countNumberOfRolls = 0;
        Integer numOfSides = 100;

        while (countNumberOfRolls < 1000000000){
            Integer result = Rolls.rollDie(numOfSides);
            if (result < 1 || result > 100){
                Assertions.fail();
            }
            countNumberOfRolls++;
        }
    }

}