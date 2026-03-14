import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号：");
        int num = sc.nextInt();
        if (num >= 0 && num <= 100) {
            if (num % 2 == 1) {
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        }
    }

}
