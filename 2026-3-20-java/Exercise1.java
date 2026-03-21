import java.util.Scanner;

public class Exercise1 {
    public static int getMax(int a, int b, int c){
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }
    public static int getMin(int a, int b, int c){
        int temp = a < b ? a : b;
        int min = temp < c ? temp : c;
        return min;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int num3 = sc.nextInt();

        int max = getMax(num1, num2, num3);
        int min = getMin(num1, num2, num3);
        int mid= (num1 + num2 + num3) - max - min;
        System.out.println(max + " " + mid + " " + min);
    }
}
