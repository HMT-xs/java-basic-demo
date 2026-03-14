import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存入的金额:");
        int money = sc.nextInt();
        System.out.println("请输入年限:");
        int year = sc.nextInt();

        //定义本息
        double rate = 0;
        if(money >= 1000){
            if(year == 1){
                rate = 0.0225;
            }
            else if(year == 2){
                rate = 0.027;
            }
            else if(year == 3){
                rate = 0.0325;
            }
            else if(year == 5){
                rate = 0.036;
            }
            else{
                System.out.println("输入年份无效");
                return;
            }
        }
        else{
            System.out.println("起存金额不够");
            return;
        }
        double total = money + money * rate * year;
        System.out.println("存"+year+"年的本息是:"+total);


    }
}
