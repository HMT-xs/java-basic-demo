package Day16;

import java.util.Random;
import java.util.Scanner;

public class StringExercise2 {
    //打乱字符串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        String str2 = randomString(str);
        System.out.println(str2);
    }

    public static String randomString(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int r1 = r.nextInt(str.length());
            char temp = arr[i];
            arr[i] = arr[r1];
            arr[r1] = temp;
        }
        String str1 = new String(arr);
        return str1;
    }
}
