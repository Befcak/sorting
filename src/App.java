public class App {
    public static void main(String[] args) throws Exception {
        int arrSize = 100000;
        int largestNum = 2000;
        int[] arr = NumberGenerator.generateArray(arrSize, largestNum);
        String[] algos = {"bubble","insertion","merge"};

        for(String temp : algos)
        {
            Thread obj = new Thread(new Sort(temp, arr.clone()));
            obj.start();
        }
    }
}
