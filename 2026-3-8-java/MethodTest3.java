public class MethodTest3 {
    //统计数组中奇偶负的个数
    public static int[] countNumber(int[] arr){
        int ji=0;
        int ou=0;
        int fu=0;
        //遍历+判断
        for(int num:arr){
            if(num<0){
                fu++;
            }
            if(num%2==0){
                ou++;
            }
            else{
                ji++;
            }
        }
        return new int[]{ji,ou,fu};
    }

    public static void main(String[] args){
        int[] arr={-3,6,7,9,100,567,-333};
        int[] result=countNumber(arr);
        System.out.println("奇数个数："+result[0]);
        System.out.println("偶数个数："+result[1]);
        System.out.println("负数个数："+result[2]);
    }
}
