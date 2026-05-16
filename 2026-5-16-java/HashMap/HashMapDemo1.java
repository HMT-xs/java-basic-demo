package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        //自定义键要重写hashCode和equals
        HashMap<Student,String> hm = new HashMap<>();

        Student stu1 = new Student("zhangsan", 18);
        Student stu2 = new Student("lisi", 19);
        Student stu3 = new Student("wangwu", 20);

        hm.put(stu1, "北京");
        hm.put(stu2, "上海");
        hm.put(stu3, "广州");

        //键找值
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("---------------------------");

        //键值对
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("---------------------------");

        //lambda
        hm.forEach((key,value)-> System.out.println(key + "=" + value));

    }
}
