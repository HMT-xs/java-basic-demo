package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //map的第一种遍历方式(键找值)
        Map<String,String> map = new HashMap<>();
        map.put("zhangsan", "001");
        map.put("lisi", "002");
        map.put("wangwu", "003");

        //获取所有的键 放到一个单列集合中
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //用get()方法 获取键(key)所对应的值(value)
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

    }
}
