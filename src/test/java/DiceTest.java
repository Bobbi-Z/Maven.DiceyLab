
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class DiceTest {

    Dice dice = new Dice();

    @Test
    void testDice(){ //given //when //then
        Integer givenNumOfDie = 2;
        Die die = Die.D6;

        dice = new Dice(givenNumOfDie, die);

       Assertions.assertEquals(givenNumOfDie, dice.getNumberOfDie());
       Assertions.assertEquals(die.getNumberOfSidesForEnum(), dice.getNumberOfSides());

    }

    @Test
    void setNumberOfDieTest() {
        Integer givenNumOfDie = 5;
        dice.setNumberOfDie(givenNumOfDie);
        Integer actualNumOfDie = dice.getNumberOfDie();
        Assertions.assertEquals(givenNumOfDie, actualNumOfDie);
    }


    @Test
    void setNumberOfSidesTest() {
        Integer expectedNumSides = 6;
        Die given = Die.D6;
         dice.setNumberOfSides(given);
        Integer actualNumOfSides = dice.getNumberOfSides();
        Assertions.assertEquals(expectedNumSides, actualNumOfSides);
    }

    @Test
    void findDieInDice() {
    }
}