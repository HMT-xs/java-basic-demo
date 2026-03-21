public class Exercise6 {
    public static int[] copyOf(int[] arr, int newLength){
        int index = 0;
        int[] newArr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] copyArr = copyOf(arr, 6);
        System.out.print("{");
        for (int i = 0; i < copyArr.length; i++) {
            if(i == copyArr.length - 1){
                System.out.print(copyArr[i]);
            }
            else {
                System.out.print(copyArr[i] + ",");
            }
        }
        System.out.println("}");
    }
}
