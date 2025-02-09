/**
 * @author  Hai Nguyen
 *
 *
 * Create a coin toss simulation program.
The simulation program should toss coin randomly and track the count
of heads or tails.

You need to write a program that can perform following operations:
a. Toss a coin randomly.
b. Track the count of heads or tails.
c. Display the results.

Use java.util.Random to determine heads/tails
Write a class called Coin, Driver, and Simulation

---
public class Driver{
- Call Simulation
}

class Simulation{
- public void toss(Coin n, int count)
- While loop where coin is tossed, side is tracked (Record)
- Use java.util.random to generate a Boolean value
- True = Head, False = Tail
- after each iteration, print index +1, head/tail (Using printRecord)
}


pubic class Coin{
    private str coinFace

public void toss(){
    coinFace =
}

method printRecord(int index, coinFace);
    System.out.printf("Try: %2d \t Value: %5s%n", index, coinFace)


public String getcoinFace(){
    return coinFace;

}
*/


public class Driver {
    public static void main(String[] args) {
        System.out.printf("Simulation 1 using: Quarter%n");
        Coin quarter = new Coin();
        Simulation s1 = new Simulation();
        s1.simulateCoin(quarter);
        s1.printSimulationReport();

        System.out.printf("%nSimulation 2 using: Dime%n");
        Coin dime = new Coin();
        Simulation s2 = new Simulation();
        s2.simulateCoin(dime);
        s2.printSimulationReport();

        System.out.printf("%nSimulation 3 using: Nickel%n");
        Coin nickel = new Coin();
        Simulation s3 = new Simulation();
        s3.simulateCoin(nickel);
        s3.printSimulationReport();
    }
}

/**
 ****************
 **** OUTPUT ****
 ****************

Simulation 1 using: Quarter
Heads:   8
Tails:  12

Simulation 2 using: Dime
Heads:   9
Tails:  11

Simulation 3 using: Nickel
Heads:  10
Tails:  10
 */

