package Day15;
//将数组转换为字符串
public class StringDemo2 {
    public static String arrayToString(int[] arr){
        if (arr ==null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i ==arr.length-1){
                result = result + arr[i];
            }
            else{
                result = result + arr[i] + ",";
            }
        }
        result = result + "]";
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = arrayToString(arr);
        System.out.println(str);
    }
}
