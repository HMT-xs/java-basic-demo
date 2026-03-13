public class Developer extends Employee{
    public Developer(String name,double salary){
        super(name,salary);
    }
    @Override
    public void doWork(){
        System.out.println("写代码，工资："+salary);
    }
}
