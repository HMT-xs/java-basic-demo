public class TestStudent {
    public static void main(String[] args){
        Student s=new Student("张三",18,"12345");
        System.out.println("学生姓名："+s.getName());
        System.out.println("学生年龄："+s.getAge());
        System.out.println("学生学号："+s.getId());
    }
}
