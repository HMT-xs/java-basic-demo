import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        for (int i = 1; i <= num / 2; i++) {
            if (i * i == num){
                System.out.println(num + "的平方根是:" + i);
                break;
            }
            else if (i * i < num && (i+1) * (i+1) >num) {
                System.out.println(num + "平方根整数部分是:" + i);
                break;
            }
        }
    }
}
