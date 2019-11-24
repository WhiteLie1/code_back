package cn.itcast.day04.demo03.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Iterator 迭代器是一个接口，我们无法直接使用，需要使用Iterator接口实现类对象，获取实现类的方式比较特殊，
collection接口中有一个方式交，这个方法返回的就是迭代器的实现类对象
 */
public class Demo02Iterator {
    public static void main(String[] args) {
        // 1.创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        // 2.往集合里填东西
        coll.add("A");
        coll.add("B");
        coll.add("C");
        coll.add("D");
        coll.add("E");
        // 3. 迭代器的泛型跟着集合走 没有元素，返回false,再取值就会报错
        Iterator<String> it = coll.iterator();
//        boolean b = it.hasNext();
//        System.out.println(b);
//
//        String s = it.next();
//        System.out.println(s);

        //循环优化输出元素
        while (it.hasNext()){
            String e = it.next();
            System.out.print(e);
        }
        System.out.println("=================");
        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
            String e = it2.next();
            System.out.println(e);
        }
    }
}
