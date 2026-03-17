import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        int[] arr1 = {12,14,23,45,66,68,70,77,90,91};
        int[] arr2 = new int[11];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] <= num){
                arr2[i] = arr1[i];
                index = i + 1;
            }
            else {
                arr2[i + 1] = arr1[i];
            }
        }
        arr2[index] = num;
        System.out.println("全新排列后的数组是:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
