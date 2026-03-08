public class BasicSyntax {
    public static void main(String[] args){
        //输出 1到 100
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }

        //判断奇偶
        int num=5;
        if(num%2==0)
            System.out.println("这个数是偶数 ");
        else {
            System.out.println("这个数是奇数");
        }

        //计算1到100的和
        int sum=0;
        for(int j=1;j<=100;j++){
            sum=sum+j;
        }
        System.out.println("1到100的和是；"+sum);
    }
}
