import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int i = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int j = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int k = sc.nextInt();

        if(i < j && i <k){
            System.out.println("最小值是:"+i);
        }
        else if(j < i && j < k){
            System.out.println("最小值是:"+j);
        }
        else{
            System.out.println("最小值是:"+k);
        }

    }
};

