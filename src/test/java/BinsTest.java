import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class BinsTest {
    Bins testBins = new Bins();

    @Test
    void constructorTest(){
        Integer expectedMin = 4;
        Integer expectedMax = 24;
        Dice testDice = new Dice(4, Die.D6);
        testBins = new Bins(testDice.getNumberOfDie(), (testDice.getNumberOfSides() * testDice.getNumberOfDie()));

        Integer actualMin = testBins.getMin();
        Integer actualMax = testBins.getMax();

        Assertions.assertEquals(expectedMin, actualMin);
        Assertions.assertEquals(expectedMax, actualMax);
    }


    @Test
    void setMinTest() {
        Integer expectedMin = 2;
        Dice testDice = new Dice (2, Die.D20);
        testBins.setMin(testDice);

        Integer actualMin = testBins.getMin();

        Assertions.assertEquals(expectedMin, actualMin);
    }


    @Test
    void setMaxTest() {
        Integer expectedMax = 40;
        Dice testDice = new Dice(2, Die.D20);
        testBins.setMax(testDice);
        Integer actualMax = testBins.getMax();

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    void testToString() {
        Bins bin = new Bins(1, 6);
        String expected = "Bins{min=1, max=6}";
        String actual = Bins.toString(bin);
        Assertions.assertEquals(expected, actual);

        System.out.println(Bins.toString(bin));
    }
}