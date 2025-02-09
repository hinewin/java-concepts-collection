/**
 * Simulation class runs a simulation on a certion action.
 * Run the simulation x amount of time
 * Report the action throughout that x amount of iteration
 */
public class Simulation {
    int ITERATION = 20;
    int headsCounter = 0;
    int tailsCounter = 0;

    public Simulation( ){
    }
    // Method to print out report
    public void printSimulationReport(){
        System.out.printf("Heads: %3d%nTails: %3d%n", headsCounter,tailsCounter);

    }
    // Method to flip coin 20 times
    public void simulateCoin(Coin coin){
        for (int i = 0; i < ITERATION; i++) {
            coin.toss();
            if (coin.getcoinFace().equals("Heads")) {
                headsCounter++;
            } else {
                tailsCounter++;
            }
        }
    }
}
