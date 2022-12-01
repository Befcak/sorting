import java.util.Random;

public class NumberGenerator {

    public static int[] generateArray(int size, int largestNum) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = generateNumber(largestNum);
        }
        return arr;
    }

    private static int generateNumber(int largestNum) {
        return new Random().nextInt(largestNum);
    }
}
