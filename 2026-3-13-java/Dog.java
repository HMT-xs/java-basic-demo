public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void shout(){
        System.out.println(name+":汪汪");
    }

}
