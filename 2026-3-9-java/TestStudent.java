public class TestStudent {
    public static void main(String[] args){
        //创建对象
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setId("123456");
        s1.showInfo();

        Student s2=new Student();
        s2.setName("李四");
        s2.setAge(19);
        s2.setId("12345");
        s2.showInfo();


    }
}
