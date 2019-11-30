package cn.itcast.day04.demo03.Collections;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;

public class Demo01Collections  {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 往集合中添加多个元素
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);

        Collections.shuffle(list); // 打乱集合顺序
        System.out.println(list);


    }
}
