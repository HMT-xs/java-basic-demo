package Day16;

public class StringBuilderDemo2 {
    //数组转换成字符串
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String result = arrayToString(arr);
        System.out.println(result);
    }

    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
                sb.append(arr[i]+", ");
            }
            else{
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        String str = sb.toString();
        return str;
    }
}
