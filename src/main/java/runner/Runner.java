package runner;

/**
 *
 * @author Kasper
 */
public class Runner {

    public static void main(String[] args) {
        Facade face = new Facade();
        Populater pop = new Populater();

        pop.fillDB();

    }

}
