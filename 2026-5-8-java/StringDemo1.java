package Day15;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String rightName = "zhangsan";
        String rightpassword = "123456";

        int  n = 3;
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String name = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();

            if(name.equals(rightName) && password.equals(rightpassword)){
                System.out.println("登陆成功！");
                break;
            }
            else if(i < n-1){
                System.out.println("用户名或密码不正确,您还有"+(n-1-i)+"次机会");
            }
            else{
                System.out.println("输入次数达到上限，账号被冻结");
                break;
            }
        }
    }
}
