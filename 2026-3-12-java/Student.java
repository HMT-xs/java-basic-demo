public class Student extends Person{
    String studentId;
    String major;
    public Student(String name,int age,String studentId,String major){
        super(name,age);
        this.studentId=studentId;
        this.major=major;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("学生学号："+studentId+",学生专业："+major);
    }

    public static void main(String[] args){
        Student s=new Student("张三",19,"123456","计算机");
        s.showInfo();
    }

}
