import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r= new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100);
            arr[i] = num;
            sum = sum + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(sum);
    }


}
