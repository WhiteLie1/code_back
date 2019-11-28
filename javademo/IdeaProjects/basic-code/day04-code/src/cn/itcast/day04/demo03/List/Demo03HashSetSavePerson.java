package cn.itcast.day04.demo03.List;

import java.util.HashSet;

/*
    HashSet存储自定义类型的元素
    set集合报错元素唯一：
        存储的元素(String,Integer,...Student,Person....),必须重写hashcode方法和Equals方法
    要求：
        同名同年龄的人，视为同一个人
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        // 创建一个HashSet集合存储Person
        HashSet<Demo03Person> set = new HashSet<>();
        Demo03Person p1 = new Demo03Person("小美女",18);
        Demo03Person p2 = new Demo03Person("小美女",18);
        Demo03Person p3 = new Demo03Person("小美女",19);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
