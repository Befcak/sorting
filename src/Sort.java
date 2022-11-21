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
