import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客类别（0表示普通顾客，1表示会员）:");
        int type = sc.nextInt();
        System.out.println("请输入折前金额:");
        int money1 = sc.nextInt();

        double money2;
        if(type == 0){
            if(money1 > 0 && money1 < 100){
                System.out.println("不打折");
            }
            else if(money1 >= 100){
                money2 = money1 * 0.9;
                System.out.println("打折后金额是:"+money2);
            }
            else{
                System.out.println("输入金额无效");
            }
        }
        else if(type == 1){
            if(money1 >0 && money1 <200){
                money2 = money1 * 0.8;
                System.out.println("打折后金额是:"+money2);
            }
            else if(money1 >= 200){
                money2 = money1 * 0.75;
                System.out.println("打折后金额是:"+money2);
            }
            else{
                System.out.println("输入金额无效");
            }
        }
    }
}
