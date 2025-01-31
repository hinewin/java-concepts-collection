import java.util.Arrays;

public class LotteryDrawing {
    public static void main(String[] args) {
        int n = 49;
        int k = 6;
        
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) numbers[i] = i + 1;

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        for (int r : result) System.out.println(r);
    }
}