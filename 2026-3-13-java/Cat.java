public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void shout(){
        System.out.println(name+":喵喵");
    }
}
