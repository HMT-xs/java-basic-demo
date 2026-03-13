public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void showInfo(){
        System.out.println("学生姓名："+name+",学生年龄："+age);
    }
}
