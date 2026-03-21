package test;

import java.util.Scanner;

//评委打分求平均分
public class Test3 {
    public static int[] getScore(){
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入评委的打分:");
            int score = sc.nextInt();
            if(score >= 0 && score <= 100) {
                arr[i] = score;
                i++;
            }
            else {
                System.out.println("录入分数无效，当前i为：" + i);
            }
        }
        return arr;
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] scoreArr = getScore();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);
        int ave = (sum - max - min)/(scoreArr.length - 2);
        System.out.println("平均分为:" + ave);
    }


}
