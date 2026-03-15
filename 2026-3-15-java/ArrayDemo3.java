import java.util.Random;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        double sum = 0;
        double ave = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100)+1;
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            ave = sum / arr.length;
            if(arr[i] < ave) {
                count++;
            }
        }
        System.out.println("数组中所有数据的和为:" + sum + ",平均值为:" + ave + ",有" + count + "个数比平均值小");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
