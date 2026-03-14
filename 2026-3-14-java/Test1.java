
//判断回文数
public class Test1 {
    public static void main(String[] args) {
        int num1 = 1234;//原始数
        int temp = num1;//临时变量存num1一开始的值，用于最后一步比较
        int num2 = 0;//颠倒之后的数
        while(num1 != 0){
            int ge = num1 % 10;
            num1 = num1 / 10;
            num2 = num2 * 10 + ge;
        }
        System.out.println(num2);
        System.out.println(temp == num2);


    }
}
