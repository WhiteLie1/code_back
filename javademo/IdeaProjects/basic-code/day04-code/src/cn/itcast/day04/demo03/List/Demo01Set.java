package cn.itcast.day04.demo03.List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // 使用add方法往集合中添加数据
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        // 使用迭代器遍历set
        Iterator<Integer> a = set.iterator();
        while (a.hasNext()){
            Integer s = a.next();
            System.out.println(s); // 1 2 3
        }
        System.out.println("==================");
        // 使用增强for循环
        for (Integer s : set) {
            System.out.println(s);
        }

    }
}
