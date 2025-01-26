/**
 * Practice exercises on switch statements
 */

public class SwitchCase {
    /**
     * No fall through, expression.
     * Determine both number of letters in the season name
     * and suggests an activity
     */

    public static int SeasonCounterExpression(String seasonName){

        // Expression with no fallthrough
        return switch (seasonName) {
            case "Spring" -> {
                System.out.println("Spring flowers blooming!");
                yield 6;
            }
            case "Summer", "Winter" -> 6;
            case "Fall" -> 4;
            default -> -1;
        };
    }

    /**
     * No fall through, statement.
     * Determine both number of letters in the season name
     * and suggests an activity
     */
    public static int SeasonCounterStatement(String seasonName){
        int seasonLetters;
        switch (seasonName){
            case "Spring":
            {
                System.out.println("Spring flowers blooming!");
                seasonLetters = 6;
                break;
            }
            case "Summer", "Winter": {
                seasonLetters = 6;
                break;
            }
            case "Fall": {
                seasonLetters = 4;
                break;
            }
            default:
                seasonLetters = -2;
        }
        return seasonLetters;
    }

    /**
     * Statement, Fall through
     * Determine if the day is a weekday or weekend
     */


    public static void main(String[] args) {
        // Expression no fallthrough
        System.out.println(SeasonCounterExpression("Fall"));
        // 4

        // Statement no fallthrough
        System.out.println(SeasonCounterStatement("invalid"));
        // -2

    }
}