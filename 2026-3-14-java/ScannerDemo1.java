//导包
import java.util.Scanner;
public class ScannerDemo1 {
   public static void main(String[] args){
//创建对象,要开始用scanner
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入第一个数字");
       //接收数据
       int num1=sc.nextInt();
       System.out.println("请输入第二个数字");
       int num2=sc.nextInt();
       System.out.println(num1+num2);
   }
}
