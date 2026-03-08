public class MethodTest1 {
    public static boolean prime(int n){
        //判断是否是质数
        if(n<1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(prime(0));
        System.out.println(prime(658));

        boolean result=prime(1);
        System.out.println(result);
    }
}
