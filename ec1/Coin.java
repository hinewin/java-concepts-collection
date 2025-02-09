import java.util.Random;

/**
 * Coin class that has 2 methods
 * toss which utilize java.util.Random to the coin face
 * getCoinFace return the value after being tossed
 */

public class Coin {
    // Instance Fields
    private String coinFace;

    // Constructor (Use default constructor)
    // public Coin(){

    // }

    // Setter Method
    public void toss(){
        Random random = new Random();
        coinFace = random.nextBoolean() ? "Heads": "Tails";
    }

    // Getter Method
    public String getcoinFace(){
        return coinFace;
    }
}
