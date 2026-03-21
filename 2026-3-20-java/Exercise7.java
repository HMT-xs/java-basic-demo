import java.util.Random;

public class Exercise7 {
    //抽奖系统
    public static boolean randomPrize(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,588,888,1000,10000};//奖金数组
        int[] arr2 = new int[arr1.length];//已抽取奖金数组
        Random r = new Random();
        for (int i = 0; i < arr1.length; ) {
            int randomIndex = r.nextInt(arr1.length);//生成随机索引
            int prize = arr1[randomIndex];
            boolean flag = randomPrize(arr2, prize);
            if(!flag){
                arr2[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
