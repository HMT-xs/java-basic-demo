public class ForDemo1 {
    public static void main(String[] args) {
        //for循环累加求和,sum只能定义在for外面
        int sum = 0;
        for(int i = 1; i <= 5; i++){
             sum += i;
        }
        System.out.println(sum);

        for (int j = 1; j <= 100; j++) {
            if(j % 2 == 0){
                sum += j;
            }
        }
        System.out.println(sum);

    }
}
