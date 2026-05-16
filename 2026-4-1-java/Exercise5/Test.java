package Exercise5;

public class Test {
    public static void main(String[] args) {
        Role r1 = new Role("张三", 100);
        Role r2 = new Role("李四", 100);

        while(true){
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+ "赢了");
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName()+ "赢了");
                break;
            }
        }
    }
}
