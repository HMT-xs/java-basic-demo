public abstract class Employee {
    String name;
    double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public void work(){
        System.out.println(name+"正在工作");
    }
    public abstract void doWork();
}
