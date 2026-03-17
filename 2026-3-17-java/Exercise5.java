public class Exercise5 {
    //数组求平均值
    public static void main(String[] args) {
        int[] arr = {72,89,65,87,71,93,76,68};
        int sum = 0;
        double ave = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            ave = sum / 10;
        }
        System.out.println(ave);
    }

}
