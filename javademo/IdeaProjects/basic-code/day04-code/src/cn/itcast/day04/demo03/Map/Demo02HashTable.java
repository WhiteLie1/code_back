package cn.itcast.day04.demo03.Map;

import java.util.HashMap;
import java.util.Hashtable;

/*
    Hashtable:底层也是哈希表，是一个线程安全的集合，是单线程集合，速度慢
    HashMap:底层也是一个哈希表，是一个线程不安全的集合，是多线程集合，速度快
    HashMap集合可以存储null值，null键
    Hashtable集合不可以存储null值，null键

 */
public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);

        Hashtable<String,String> table = new Hashtable<>();
//        table.put(null,"a"); // java.lang.NullPointerException
    }

}
