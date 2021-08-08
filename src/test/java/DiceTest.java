
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class DiceTest {

    Dice dice = new Dice();

    @Test
    void testDice(){ //given //when //then
        Integer givenNumOfDie = 2;
        Integer givenNumOfSides = 6;

        dice = new Dice(givenNumOfDie, givenNumOfSides);

       Assertions.assertEquals(givenNumOfDie, dice.getNumberOfDie());
       Assertions.assertEquals(givenNumOfSides, dice.getNumberOfSides());

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
}