public class ArrTest1 {
    public static void main(String[] args) {
        //两数交换原理
        int a = 10;
        int b = 20;
        int temp1 = a;
        a = b;
        b = temp1;
        System.out.println(a);
        System.out.println(b);

        int[] arr = {1,2,3,4,5};
        int temp2 = arr[0];
        arr[0] = arr[4];
        arr[4] = temp2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
