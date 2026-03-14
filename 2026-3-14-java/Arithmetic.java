public class Arithmetic {
    public static void main(String[] args){
        int a=10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);

        //先用后加，先把b赋值给c，再自增
        int b=10;
        int c=b++;
        System.out.println("b:"+b);
        System.out.println("c:"+c);

        //先加后用
        int i=10;
        int j=++i;
        System.out.println("i:"+i);
        System.out.println("j:"+j);

    }
}
