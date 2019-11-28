package cn.itcast.day04.demo03.List;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("abfdsfsdfdc");
        System.out.println(set); // [abc, www, abfdsfsdfdc] 无序的，不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("abfdsfsdfdc");
        System.out.println(linked); // [www, abc, abfdsfsdfdc] 有序的

    }
}
