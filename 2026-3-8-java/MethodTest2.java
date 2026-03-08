public class MethodTest2 {
    public static int getArrayMAx(int[] arr){
        int max=arr[0];
        //遍历数组
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr ={10,50,7,888,26,77};
        System.out.println("数组最大值是："+getArrayMAx(arr));
    }
}
