public class Student {
    private String name;
    private int age;
    private String id;
    public String getName(){//getter方法读取私有变量的值
        return name;
    }
    public void setName(String name){//setter方法修改私有变量的值
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public void showInfo(){
        System.out.println("姓名："+name+",年龄："+age+",学号："+id);
    }
}
