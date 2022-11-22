public class App {
    public static void main(String[] args) throws Exception {
        int arrSize = 100000;
        int largestNum = 20000;
        int[] arr = NumberGenerator.generateArray(arrSize, largestNum);
        long start = 0;
        long end = 0;

        int[] bubbleArray = arr;
        int[] insertionArray = arr;

        // Sort.printArray(arr, "unsorted");
        start = System.currentTimeMillis();
        Sort.insertionSort(insertionArray);
        end = System.currentTimeMillis();
        // Sort.printArray(arr, "sorted");
        System.out.println(Sort.isSorted(insertionArray));
        System.out.println("Insertion sort took " + (end - start) + "ms");

        // Sort.printArray(arr, "unsorted");
        start = System.currentTimeMillis();
        Sort.bubbleSort(bubbleArray);
        end = System.currentTimeMillis();
        // Sort.printArray(arr, "sorted");
        System.out.println(Sort.isSorted(bubbleArray));
        System.out.println("Bubble sort took " + (end - start) + "ms");

    }
}
