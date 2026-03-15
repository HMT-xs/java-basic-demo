import java.util.Random;//用于生成随机数
import java.util.Scanner;
//猜数字小游戏 保底：五次
public class LoopTest4 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        int count =0;
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("请输入你要猜的数字:");
        int guessNum = sc.nextInt();
        count++;
        if(count == 5){
            System.out.println("正确");
            break;
        }
            if(guessNum > num){
                System.out.println("大了");
            }
            else if (guessNum < num) {
                System.out.println("小了");
            }
            else {
                System.out.println("正确");
                break;
            }
        }


    }
}
