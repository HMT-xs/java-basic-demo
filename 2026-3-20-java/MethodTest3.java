public class MethodTest3 {
    //判断数组中是否存在某个数据
    public static boolean contain(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,22,444,55,98,66,45,66,7,3};
        boolean flag = contain(arr,45);
        System.out.println(flag);
    }
}
