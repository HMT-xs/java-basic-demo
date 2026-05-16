package Day16;

import java.util.Scanner;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //判断字符串是否对称
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        String result = new StringBuilder().append(str).reverse().toString();
        if(str.equals(result)){
            System.out.println("字符串是对称的");
        }
        else{
            System.out.println("字符串不对称");
        }
    }
}
