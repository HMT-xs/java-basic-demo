import java.util.Scanner;

public class Exercise3 {
    //计算一个正整数是几位数
    public static int getLength(int num){
        int count = 0;
        if(num == 0){
            return 1;
        }
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();

        System.out.println(num + "是" + getLength(num) + "位数");
    }
}
