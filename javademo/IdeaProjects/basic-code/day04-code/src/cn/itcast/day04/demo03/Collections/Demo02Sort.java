package cn.itcast.day04.demo03.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);

        // 默认集合升序
        Collections.sort(list01);
        System.out.println(list01);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02);

        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三",18));
        list03.add(new Person("李四",20));
        list03.add(new Person("王五",14));
        System.out.println(list03);

        Collections.sort(list03);
        System.out.println(list03);

    }
}
