package cn.itcast.day04.demo03.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        // 创建一个map集合
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        // 使用一个map集合的方法keyset(),把map集合所有的key取出来，存储到一个set集合中
        Set<String> set = map.keySet();
        // 使用迭代器遍历set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            // 通过map集合中的方法get()，通过key找到value
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("--------------");
        for (String key:set){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
