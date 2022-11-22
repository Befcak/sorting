public class Sort {
    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        int temp = 0;
        while (len != 0) {
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            len--;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        int temp = 0;
        int place = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
            if (place > 0) {
                for (int j = place; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    } else
                        break;
                }
            }

            place++;
        }

        return arr;
    }

    public static int[] mergeSort(int[] arr) {

        return arr;
    }

    public static int[] selectionSort(int[] arr) {

        return arr;
    }

    public static int[] quickSort(int[] arr) {

        return arr;
    }

    public static int[] heapSort(int[] arr) {

        return arr;
    }

    public static int[] countingSort(int[] arr) {

        return arr;
    }

    public static int[] radixSort(int[] arr) {

        return arr;
    }

    public static int[] bucketSort(int[] arr) {

        return arr;
    }

    public static int[] shellSort(int[] arr) {

        return arr;
    }

    public static int[] timSort(int[] arr) {

        return arr;
    }

    public static int[] combSort(int[] arr) {

        return arr;
    }

    public static int[] pigeonholeSort(int[] arr) {

        return arr;
    }

    public static int[] cycleSort(int[] arr) {

        return arr;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void printArray(int[] arr, String title) {
        System.out.print(title + " : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
