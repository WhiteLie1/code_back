package cn.itcast.day04.demo03.generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符：
    ？ 代表的是任意的数据类型
    使用方式：
        不能创建对象使用
        只能作为方法的参数使用

 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

        ArrayList<String> list03 = new ArrayList<>();

    }
    //定义一个方法，能遍历所有类型的Arraylist集合
    public static void printArray(ArrayList<?> list){
        // 使用迭代器来遍历集合
        Iterator<?> it = list.iterator();
        // it.next()方法取出来的元素是Object，可以接收任意的数据类型
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }


    }
}
