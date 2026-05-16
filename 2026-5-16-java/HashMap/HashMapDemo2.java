package HashMap;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        //80个人投票 记录每个选项的票数 并且说出最多的票数是哪个
        //1.先让学生投票 用数组记录选项 用集合记录投票结果
        String[] arr = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(arr.length-1);
            list.add(arr[index]);
        }

        //用map集合进行统计
        HashMap<String,Integer> hm = new HashMap<>();
        for (String section : list) {
            if(hm.containsKey(section)){
                //存在
                int count = hm.get(section);
                count++;
                hm.put(section,count);
            }
            else {
                //不存在 直接添加
                hm.put(section,1);
            }
        }
        System.out.println(hm);

        //判断最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }
        System.out.print(max + "-->");

        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() == max){
                System.out.println(entry.getKey());
            }
        }
    }
}
