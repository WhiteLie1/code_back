package cn.itcast.day04.demo03.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/*

 */
public class Demo01Generic {
    public static void main(String[] args) {
        show02();
    }
    // 创建集合对象，使用泛型
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc ");
        // 迭代器循环
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }

    /*
    创建集合对象，不使用泛型：
        1.好处：
            集合不使用泛型，默认的类型就是object类型，可以存储任意类型的数据
        2.弊端
            不安全，引发异常

     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        // 使用迭代器遍历list集合
        Iterator it = list.iterator();
        // 使用迭代器中的方法遍历集合
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        // 想要使用String类来获取字符串的长度，不能使用多态的方法，需要转型
//        String s = (String)obj; 会产生异常
//        System.out.println(s.length());
    }
}
