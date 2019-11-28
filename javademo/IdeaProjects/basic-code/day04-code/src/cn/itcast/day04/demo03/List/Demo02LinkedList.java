package cn.itcast.day04.demo03.List;

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        show03();
    }

    private static void show03() {
        // 创建集合对象
        LinkedList<String> linked = new LinkedList<>();
        // 使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        String first = linked.removeFirst();
        System.out.println(first);
        String last = linked.removeLast();
        System.out.println(last);
    }

    private static void show02() {
        // 创建集合对象
        LinkedList<String> linked = new LinkedList<>();
        // 使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        linked.clear();// 清空集合元素，在获取集合中的元素会抛出异常 NoSuchElementException
        if(!linked.isEmpty()){ // 判断非空
            String first = linked.getFirst();
            System.out.println(first);
            String last = linked.getLast();
            System.out.println(last);
        }


    }

    private static void show01() {
        // 创建集合对象
        LinkedList<String> linked = new LinkedList<>();
        // 使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked); // [a, b, c]

        // 集合开头添加元素
//        linked.addFirst("www");
        linked.push("www");
        System.out.println(linked); // [www, a, b, c]

    }
}
