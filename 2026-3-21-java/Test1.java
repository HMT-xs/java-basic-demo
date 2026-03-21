package test;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        int ticket = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入舱型（头等舱0，经济舱1）:");
        int seat = sc.nextInt();
        double newTicket = 0;
        if(month >= 5 && month <= 10){
            if(seat == 0){
                newTicket = ticket * 0.9;
            }
            else if(seat == 1){
                newTicket = ticket * 0.85;
            }
        }
        else if((month >= 11 && month <= 12) || (month >= 1 && month <= 4)){
            if(seat == 0){
                newTicket = ticket * 0.7;
            }
            else if(seat == 1) {
                newTicket = ticket * 0.65;
            }
        }
        System.out.println("实际票价为:" + newTicket);
    }
}
