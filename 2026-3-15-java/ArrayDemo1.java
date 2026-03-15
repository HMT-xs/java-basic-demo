public class ArrayDemo1 {
    //数组长度属性:length
    //调用方式:数组名.length
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,3,6,8,9,3,45,67,5,77,2,3};
        int sum = 0;
        for (int i = 0; i <= arr1.length - 1; i++) {
            sum = sum + arr1[i];
        }
        System.out.println(sum);

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 3 == 0){
                count++;
            }
        }
        System.out.println("数组中一共有" + count + "个数可以被3整除");

        int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] % 2 == 1){
                arr3[i] = arr3[i] * 2;
            }
            else if (arr3[i] % 2 == 0) {
                arr3[i] = arr3[i] / 2;
            }
        }
        //一个循环尽量只做一件事
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}
