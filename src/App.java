public class App {
    public static void main(String[] args) throws Exception {
        int arrSize = 200000;
        int largestNum = 1000;
        int[] arr = NumberGenerator.generateArray(arrSize, largestNum);

        Sort.bubbleSort(arr);
        System.out.println(Sort.isSorted(arr));

    }
}
