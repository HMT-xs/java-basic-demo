package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("aaa", "bbb");
        String value1 = m.put("ccc", "ddd");
        m.put("eee", "fff");

        System.out.println(value1);
        String value2 = m.put("aaa", "ggg");
        System.out.println(value2);

        boolean flag1 = m.containsKey("aaa");
        System.out.println(flag1);
        boolean flag2 = m.containsValue("iii");
        System.out.println(flag2);
        System.out.println(m);

    }

}
