public class Simulation {

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.init();
    }

    private void init() {
        Rolls rolls = new Rolls();
        rolls.run();
        Die die = new Die();
        die.run();
        MultiDie multiDie = new MultiDie();
        multiDie.run();
    }


}
