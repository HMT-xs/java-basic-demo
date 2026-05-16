package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        //map的第二种遍历方法(键值对)
        Map<String,String> map = new HashMap<>();

        map.put("zhangsan", "001");
        map.put("lisi", "002");
        map.put("wangwu", "003");

        //通过entrySet()方法把所有键值对放到一个set集合中
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //用getKey和getValue把entry里面的键和值都拿出来
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
