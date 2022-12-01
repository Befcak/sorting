public class App {
    public static void main(String[] args) throws Exception {
        int arrSize = 1000000;
        int largestNum = 2000;
        int[] arr = NumberGenerator.generateArray(arrSize, largestNum);
        //String[] algos = {"selection"};
        String[] algos = {"bubble","insertion","merge","selection"};

        for(String temp : algos)
        {
            Thread obj = new Thread(new Sort(temp, arr.clone()));
            obj.start();
        }
    }
}
