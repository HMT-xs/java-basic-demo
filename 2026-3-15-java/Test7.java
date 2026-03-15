import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前工资:");
        int before = sc.nextInt();

        double a = before - before * 0.1;//扣除三险一金之后的工资
        double shui = 0;//纳税数额
        double after;//税后工资
        if(a <= 5000){
            System.out.println("不用交个人所得税");
        }
        else if (a > 5000 && a <= 8000) {
            shui = (a - 5000) * 0.03;
        }
        else if (a > 8000 && a <= 17000) {
            shui = 3000 * 0.03 + (a -5000 - 3000) * 0.1;
        }
        else if (a > 17000  && a <= 30000) {
            shui = 3000 * 0.03 + (12000 - 3000) * 0.1 + (a - 5000 - 12000) * 0.2;
        }
        else if (a >30000 && a <= 40000) {
            shui = 3000 *0.03 + (12000 - 3000) * 0.1 + (25000 - 12000)* 0.2 + (a - 5000 - 25000) * 0.25;
        }
        else if (a > 40000 && a <= 60000) {
            shui = 3000 *0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2 + (35000 - 25000) * 0.25 +(a - 5000 - 35000) * 0.3;
        }
        else if (a > 60000 && a<= 85000) {
            shui = 3000 *0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2 + (35000 - 25000) * 0.25 + (55000 - 35000) * 0.3 + (a -5000 - 550000) * 0.35;
        }
        else if (a >= 85000) {
            shui = 3000 *0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2 + (35000 - 25000) * 0.25 + (55000 - 35000) *0.3 + (80000 - 55000) * 0.35 + (a - 5000 - 80000) * 0.45;
        }
        after = a - shui;
        System.out.println("应纳税;"+shui+"元");
        System.out.println("税后工资:"+after+"元");
    }

}
