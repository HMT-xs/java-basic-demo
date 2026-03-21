public class Exercise2 {
    //求绝对值
    public static double abs(double num){
        if(num >= 0){
            return num;
        }
        return -num;
    }

    public static void main(String[] args) {
        double newNum = abs(-11.5);
        System.out.println("绝对值为:" + newNum);
    }
}
