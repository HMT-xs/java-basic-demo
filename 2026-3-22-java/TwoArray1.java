public class TwoArray1 {
    public static void main(String[] args) {
        int[][] yearArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yearSum = 0;
        for (int i = 0; i < yearArr.length; i++) {
            int[] partArr  = yearArr[i];
            int partSum = getSum (partArr);
            System.out.println("第" + (i+1)+ "个季度的营业额是:" + partSum);
            yearSum = yearSum + partSum;
        }
        System.out.println("全年总营业额是:" + yearSum);

    }
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
