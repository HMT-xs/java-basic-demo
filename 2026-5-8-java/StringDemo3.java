package Day15;

import java.util.Scanner;

//字符串的反转
public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str1 = sc.next();
        String c = reverser(str1);
        System.out.println("反转之后的字符串是:"+c);
    }
    public static String reverser(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char s = str.charAt(i);
            result = result + s;
        }
        return result;
    }
}
