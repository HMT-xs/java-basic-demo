package test;
//将加密后的密码解密
public class Test6 {
    public static void main(String[] args) {
        //定义解密后的数组
        int[] arr = {8, 3, 4, 6};
        //反转
        for (int i = 0, j = arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //取余之前的数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && arr[i] <= 4){
                arr[i] = arr[i] + 10;
            }
        }
        //每位减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
    }
}
