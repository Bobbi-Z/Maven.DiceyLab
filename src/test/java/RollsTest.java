import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollsTest {

    @Test
    void rollDieTest() {
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
}