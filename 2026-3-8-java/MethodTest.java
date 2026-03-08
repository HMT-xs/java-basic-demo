public class MethodTest {
    //求两数之和
    public static int add(int a,int b){
        return a+b;
    }
    //方法重载（同名 参数类型不同）
    public static double add(double a,double b){
        return a+b;
    }
    //求两数最大值
    public static int getMax(int a,int b){
        return a>b?a:b;
    }

    public static void main(String[] args){
        //调用方法
        System.out.println("两数之和为："+add(5,10));

        int max=getMax(10,11);
        System.out.println("最大值为："+max);

        double sum1=add(5.5,3.0);
        System.out.println("两数之和为："+sum1);
    }



}
