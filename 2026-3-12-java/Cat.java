public class Cat extends Animal{
    String name="小猫";

    public void showName(){
        System.out.println("子类 name:"+this.name);
        System.out.println("父类 name:"+super.name);
    }

    public static void main(String[] args){
        Cat c=new Cat();
        c.showName();
    }
}
