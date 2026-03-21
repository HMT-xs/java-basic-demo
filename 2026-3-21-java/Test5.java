package test;
//如何把整数每一位添加到数组中
public class Test5 {
    static void main(String[] args) {
        int num = 12345;
        int temp = num;//临时存储num
        //1.计算整数是几位数
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
//        System.out.println(count);
        //2.根据整数位数定义数组 动态初始化
        int[] arr = new int[count];
        //3.把每一位放到数组中
        int index = arr.length - 1;
        while(temp != 0){
            int gewei = temp % 10;//先取个位数
            temp = temp / 10;//再去掉个位数
            arr[index] = gewei;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
