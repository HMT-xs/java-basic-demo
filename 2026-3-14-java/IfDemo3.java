import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的分数:");
        int num = sc.nextInt();

        if(num >= 0 && num <= 100) {
            if (num >= 95 && num <= 100) {
                System.out.println("送自行车一辆");
            } else if (num >= 90 && num <= 94) {
                System.out.println("游乐场玩一天");
            } else if (num >= 80 && num <= 89) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("揍一顿");
            }
        }
        else{
            System.out.println("输入数据不合法");
        }
    }

}
