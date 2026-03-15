public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {33,5,22,44,55};
        int max = arr[0];//max的初始化值一定要是数组中的值
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("数组中最大的数字是:" + max);
    }
}
