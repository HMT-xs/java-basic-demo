public class Exercise5 {
    public static int[] fill(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        fill(arr,10);
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("}");
    }
}
