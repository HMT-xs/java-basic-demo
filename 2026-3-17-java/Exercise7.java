public class Exercise7 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[arr1.length];
        int left = 0;
        int right = arr1.length-1;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 == 1){
                arr2[left] = arr1[i];
                left++;
            }
            else {
                arr2[right] = arr1[i];
                right--;
            }
        }
        System.out.println("排列之后的数组为:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
