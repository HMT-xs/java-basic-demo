import java.util.Scanner;
//计算两种方案哪种更省钱
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入新手机的价格:");
        int newPhone = sc.nextInt();
        System.out.println("请输入旧手机价格:");
        int oldPhone = sc.nextInt();

        int money1 = newPhone - oldPhone;
        double money2 = newPhone * 0.8;
        if(money1 > money2){
            System.out.println("以旧换新更省钱");
        }
        else if(money1 < money2){
            System.out.println("不以旧换新更省钱");
        }
        else{
            System.out.println("两种方案一样省钱");
        }
    }
}
