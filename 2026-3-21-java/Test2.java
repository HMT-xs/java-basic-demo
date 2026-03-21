package test;

import java.util.Random;

//随机生成五位验证码（前四位大写或小写字母，最后一位数字）
public class Test2 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if(i <= 25){
                //a----97
                chs[i] = (char)(97 + i);
            }
            else {
                //A----65
                chs[i] = (char)(65 + i - 26);//i从26开始的
            }
        }
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }
        int num = r.nextInt(10);
        result = result + num;
        System.out.println(result);
    }
}
