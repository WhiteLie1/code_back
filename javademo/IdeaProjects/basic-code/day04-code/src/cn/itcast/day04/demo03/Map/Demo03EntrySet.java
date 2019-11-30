package cn.itcast.day04.demo03.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*

 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        // 创建一个map集合
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        // map集合中的方法，把集合中的entry对象取出来，存储到一个set集合中去
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        // 遍历set集合
        Iterator<Map.Entry<String,Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
//            System.out.println(entry);
            // 使用entry来获取键和值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("===================");
        // 增强for循环
        for (Map.Entry<String,Integer> entry:set){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
