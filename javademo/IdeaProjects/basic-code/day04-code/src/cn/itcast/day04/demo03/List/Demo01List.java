package cn.itcast.day04.demo03.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*

 */
public class Demo01List {
    public static void main(String[] args) {
        // 创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        // 使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        // 打印集合
        System.out.println(list); // [a, b, c, d, a]

        // 在c和d之间添加 itheima
        list.add(3,"itheima");
        System.out.println(list);

        // 移除列表中指定位置的元素，返回的是移除的元素
        String removeE = list.remove(2);
        System.out.println("被移除的元素"+removeE);
        System.out.println("移除后的集合"+list);

        // 指定元素替换集合中的指定位置的元素，返回值的更新前的元素
        String setE = list.set(4,"A");
        System.out.println("被替换的是"+setE);
        System.out.println(list);

        // list集合的三种遍历方式
        // 使用普通的for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("=============");
        // 迭代器循环
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------------");
        // 使用增强 for 循环
        for (String s : list) {
            System.out.println(s);
        }
    }


}
