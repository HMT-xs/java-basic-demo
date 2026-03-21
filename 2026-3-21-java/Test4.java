package test;

public class Test4 {
    //加密传输密码(以1983为例)
    public static void main(String[] args) {
        int[] arr = {1,9,8,3};
        //每个数加5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //每个数对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //反转
        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //变成最终密码
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
            System.out.println(num);
    }


}
