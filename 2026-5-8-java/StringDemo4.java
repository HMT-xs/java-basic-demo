package Day15;

import java.util.Scanner;

//将数字金额转换成中文的金额写法
public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while(true){
            System.out.print("请输入一个金额:");
            money = sc.nextInt();
            if(money >=0 && money <= 9999999){
                break;
            }else{
                System.out.println("金额无效，请重新输入!");
            }
        }
        
        //把大写的字符串拼接起来
        String moneyStr = "";
        while(money != 0){
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
            money = money / 10;
        }
        
        //前面补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);

        String result = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }

    //生成每个数字对应的中文（数组）
    public static String getCapitalNumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }



}
