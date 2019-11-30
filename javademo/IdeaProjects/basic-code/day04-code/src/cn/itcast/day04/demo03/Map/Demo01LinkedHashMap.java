package cn.itcast.day04.demo03.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    map 接口的哈希表和链表列表实现，具有可预知的迭代顺序
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","a");
        System.out.println(map); // key不允许重复，无序的。{a=a, b=b, c=c}

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        linked.put("a","a");
        System.out.println(linked); // key不允许重复，无序

    }
}
