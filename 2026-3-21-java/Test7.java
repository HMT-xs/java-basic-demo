package test;

import java.util.Random;
import java.util.Scanner;

//买彩票判断是否中奖（6个红球，1个蓝球）
//六个红球数字不能重复，蓝球可以与红球重复
//红球在1~33之间，蓝球在1~16之间
public class Test7 {
    public static void main(String[] args) {
        //生成中奖号码
        int[] prizeArr = creatNumber();
        for (int i = 0; i < prizeArr.length; i++) {
            System.out.print(prizeArr[i] + " ");
        }
        System.out.println("================");
        //输入用户购买号码
        int[] inputArr = userInputNumber();
        //判断中奖情况
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < inputArr.length - 1; i++) {
            for (int j = 0; j < prizeArr.length; j++) {
                if(inputArr[i] == prizeArr[j]){
                    redCount++;
                    break;
                }
            }
        }
        if(inputArr[inputArr.length-1] == prizeArr[prizeArr.length-1]){
            blueCount++;
        }

        //判断中奖金额
        if(redCount == 6 && blueCount == 1){
            System.out.println("中奖一千万");
        }
        else if (redCount == 6 && blueCount == 0) {
            System.out.println("中奖五百万");
        }
        else if (redCount == 5 && blueCount == 1) {
            System.out.println("中奖3000元");
        }
        else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("中奖200元");
        }
        else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1) || (redCount == 2 && blueCount == 1)) {
            System.out.println("中奖10元");
        }
        else if ((redCount == 51 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("中奖5元");
        }
        else if((redCount == 0 && blueCount == 0) || (redCount == 1 && blueCount == 0)){
            System.out.println("未中奖");
        }



    }
    //判断红球数字是否重复
    public static boolean contains(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    //中奖号码
    public static int[] creatNumber() {
        //生成数组储存七个球
        int[] arr = new int[7];
        //随机生成六个数给红球并且存到数组中
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; ) {
            int redNumber = r.nextInt(33)+1;
            boolean flag = contains(arr, redNumber);
            if(!flag){
                arr[i] = redNumber;
                i++;
            }
        }
        //随机生成一个数给蓝球并且存到数组中
        int blueNumber = r.nextInt(16)+1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    //用户购买的彩票号码
    public static int[] userInputNumber(){
        //储存七个数
        int[] arr = new int[7];
        //用户输入六个红球数字
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("请输入第" + (i+1) + "个红球号码:");
            int inputRed = sc.nextInt();
            if(inputRed >= 1 && inputRed <= 33){
                boolean flag = contains(arr, inputRed);
                if(!flag){
                    arr[i] = inputRed;
                }
                else {
                    System.out.println("该号码已经存在，请重新输入");
                }
            }
            else {
                System.out.println("输入号码超出范围，请重新输入");
            }
        }

        //用户输入一个蓝球数字
        System.out.println("请输入蓝球号码:");
        while(true){
            int inputBlue = sc.nextInt();
            if(inputBlue >= 1 && inputBlue <= 16){
                arr[arr.length-1] = inputBlue;
                break;
            }
            else{
                System.out.println("当前号码超出范围，请重新输入");
            }
        }
        return arr;
    }




}
