
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class DiceTest {

    Dice dice = new Dice();

    @Test
    void testDice(){ //given //when //then
        Integer givenNumOfDie = 2;

        dice = new Dice(givenNumOfDie);

       Assertions.assertEquals(givenNumOfDie, dice.getNumberOfDie());

    }

    @Test
    void setNumberOfDie() {
        Integer givenNumOfDie = 5;
        dice.setNumberOfDie(givenNumOfDie);
        Integer actualNumOfDie = dice.getNumberOfDie();
        Assertions.assertEquals(givenNumOfDie, actualNumOfDie);
    }

    @Test
    void rollDice() { //I want to test that when the number of die value is passed into the method that is how many
        // roll die function is called




    }
}