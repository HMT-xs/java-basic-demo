public class MethodTest4 {
    //拷贝数组
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] newArr = new int[to - from];
        int index = 0;//伪造索引的思想(当前没有一个变量能表示当前索引的变化范围)
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] copyArr = copyOfRange(arr, 3, 7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }
}
