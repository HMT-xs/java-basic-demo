package Exercise;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        int before = sc. nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入舱型(头等舱0，经济舱1):");
        int plane = sc.nextInt();

        double after = 0;
        if (month >= 5 && month <= 10) {
            if(plane == 0){
                after = before * 0.9;
            }
            else if (plane == 1) {
                after = before * 0.85;
            }
            else if (plane != 1 && plane != 0) {
                System.out.println("输入舱型错误！");
            }
        }
        else if ((month >= 11 && month<=12) || (month >= 1 && month <=4)) {
            if(plane == 0){
                after = before * 0.7;
            }
            else if (plane == 1) {
                after = before * 0.65;
            }
            else if (plane != 1 && plane != 0) {
                System.out.println("输入舱型错误！");
            }
        }
        else if (month < 1 || month > 12) {
            System.out.println("输入月份错误！");
        }
        System.out.println("打折之后票价是:" + after);
    }
}
