package Exercise;

public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("素数一共有" + count + "个");
    }
}
