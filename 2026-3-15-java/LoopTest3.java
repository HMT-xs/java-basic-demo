import java.util.Scanner;
//判断是否是质数
public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();

        boolean flag = true;
        for (int i = 2; i <= num - 1; i++) {
            if(num % i == 0){
                flag = false;
                /*System.out.println("这个数不是质数");*/
            }
        }
        if(flag){
            System.out.println("这个数是质数");
        }
        else {
            System.out.println("这个数不是质数");
        }
    }

}
