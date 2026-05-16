package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {
        //map的第三种遍历方法(lambda表达式)
        Map<String,String> map = new HashMap<>();

        map.put("zhangsan", "001");
        map.put("lisi", "002");
        map.put("wangwu", "003");

        map.forEach((key,value)-> System.out.println(key+"="+value));
    }
}
