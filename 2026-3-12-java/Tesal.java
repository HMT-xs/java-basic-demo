public class Tesal extends Car{
    @Override
    public void run(){
        super.run();
        System.out.println("特斯拉用电行驶");
    }

    public static void main(String[] args){
        Tesal t=new Tesal();
        t.run();
    }

}
