public class MethodTest2 {
    public static int maxArr(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大数是:" + max);
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {13,34,65,34,22,77};
        maxArr(arr);
    }
}
