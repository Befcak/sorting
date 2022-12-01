import java.util.Arrays;

public class Sort implements Runnable{

    private String temp;
    private int[] arr;

    public Sort(String temp, int[] arr) {
        this.temp = temp;
        this.arr = arr;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void run(){
        try {
            long start = 0;
            long end = 0;
            if(this.temp == "bubble")
            {
                // printArray(arr, temp);
                start = System.currentTimeMillis();
                this.arr = bubbleSort(this.arr);
                end = System.currentTimeMillis();
                printResult(this.temp, this.arr, start, end);

            }
            if(this.temp == "insertion")
            {
                // printArray(this.arr, this.temp);
                start = System.currentTimeMillis();
                this.arr = insertionSort(this.arr);
                end = System.currentTimeMillis();
                printResult(this.temp, this.arr, start, end);
            }
            if(this.temp == "merge")
            {
                //printArray(arr, temp);
                start = System.currentTimeMillis();
                this.arr = mergeSort(this.arr);
                end = System.currentTimeMillis();
                printResult(this.temp, this.arr, start, end);
            }
            if(this.temp == "selection")
            {
                //printArray(arr, temp);
                start = System.currentTimeMillis();
                this.arr = selectionSort(this.arr);
                end = System.currentTimeMillis();
                printResult(this.temp, this.arr, start, end);
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
    }

    private int[] bubbleSort(int[] arr) {
        if(arr.length < 2)
            return arr;
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

    private static int[] insertionSort(int[] arr) {
        if(arr.length < 2)
            return arr;
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

    private static int[] mergeSort(int[] arr) {
        if(arr.length >= 2){
            int mid = arr.length/2;
            int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
            int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length - 1);
            return combineArrays(mergeSort(leftArr), mergeSort(rightArr));
        }
        else
            return arr;
    }

    private static int[] selectionSort(int[] arr) {
        int lowest = -1;
        for(int i = 0; i < arr.length; i++){
            lowest = i;
            for(int j = i; j < arr.length; j++){
                if(arr[lowest] > arr[j])
                    lowest = j;
            }
            if(lowest != i){
                int temp = arr[i];
                arr[i] = arr[lowest];
                arr[lowest] = temp;
            }
        }

        return arr;
    }

    private static int[] quickSort(int[] arr) {

        return arr;
    }

    private static int[] heapSort(int[] arr) {

        return arr;
    }

    private static int[] countingSort(int[] arr) {

        return arr;
    }

    private static int[] radixSort(int[] arr) {

        return arr;
    }

    private static int[] bucketSort(int[] arr) {

        return arr;
    }

    private static int[] shellSort(int[] arr) {

        return arr;
    }

    private static int[] timSort(int[] arr) {

        return arr;
    }

    private static int[] combSort(int[] arr) {

        return arr;
    }

    private static int[] pigeonholeSort(int[] arr) {

        return arr;
    }

    private static int[] cycleSort(int[] arr) {

        return arr;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public void printArray(int[] arr, String title) {
        System.out.print(title + " : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    private static void printResult(String temp, int[] arr, long start, long end){
        System.out.println(temp + " sort: sorted=" + isSorted(arr) + ", time=" + (end - start) + " ms");
    }

    private static int[] combineArrays(int[] a, int[] b){
        int[] result = new int[(a.length + b.length)];
        int i = 0, j = 0;

        for(int k = 0; k < result.length; k++)
        {
            if(i >= a.length && j < b.length){
                result[k] = b[j];
                j++;
            }
            else if(j >= b.length && i < a.length){
                result[k] = a[i];
                i++;
            }
            else{
                if(a[i] <= b[j]){
                    result[k] = a[i];
                    i++;
                }
                else{
                    result[k] = b[j];
                    j++;
                }
            }
        }
        return result;
    }
}
