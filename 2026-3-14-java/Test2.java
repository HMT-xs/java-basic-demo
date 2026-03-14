public class Test2 {
    public static void main(String[] args) {
        //被除数
        int i = 501;
        //除数
        int j =10;
        int count = 0;
        while(i >= j){
            i = i - j;//最后i相当于余数
            count++;
        }
        System.out.println("商为:"+count);
        System.out.println("余数为:"+i);
    }
}
