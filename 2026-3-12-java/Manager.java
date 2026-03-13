public class Manager extends Employee{
    String department;
    public Manager(String name,double salary,String department){
        super(name,salary);
        this.department=department;
    }

    public static void main(String[] args){
        Manager m=new Manager("张三",5000,"销售部");
        System.out.println("员工姓名："+m.name+",员工薪资："+m.salary+",员工部门："+m.department);
    }
}
