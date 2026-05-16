package Exercise1;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student s1 = new Student(1, "张三", 18);
        Student s2 = new Student(2, "李四", 19);
        Student s3 = new Student(3, "王五", 20);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //再添加一个学生对象，通过学号判断唯一性
        Student s4 = new Student(4, "赵六", 21);

        //判断唯一性
        boolean flag = contains(arr,s4.getId());
        if(flag){
            //存在
            System.out.println("学号已存在，请重新输入信息");
        }
        else{
            //不存在
            int count = getCount(arr);
            if(count == arr.length){
                //存满
                //把老数组内容拷贝进新数组
               Student[] newArr = creatNewArr(arr);
               //把新内容添加进去
                newArr[count] = s4;
                printArray(newArr);
            }
            else{
                //没存满
                arr[count] = s4;
                printArray(arr);
            }
        }

    }

    //遍历学生信息
    public static void printArray(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getAge());
            }
        }
    }



    //创建新数组，把原数组内容拷贝
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }



    //判断是否存满，看已经存了几个
    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }


    //判断是否存在（boolean）
    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                if(arr[i].getId() == id){
                    return true;
                }
            }
        }
        return false;
    }
}
