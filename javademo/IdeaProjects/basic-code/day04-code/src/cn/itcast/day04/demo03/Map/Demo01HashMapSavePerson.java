package cn.itcast.day04.demo03.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型的键值：
        Map集合保证key是唯一的
            作为key的元素，必须重写hashCode方法和equals方法，以保证值唯一
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
         // 创建一个hashmap集合
        HashMap<Person,String> map = new HashMap<>();
        // 往集合中添加元素
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",18),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");
        // 使用entrySet方法和增强for循环遍历map
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for (Map.Entry<Person,String> entry:set){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }

    private static void show01() {
        // 创建hashMap
        HashMap<String,Person> map = new HashMap<>();
        // 往集合中添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));

        Set<String> set = map.keySet();
        for (String key:set){
            Person value = map.get(key);
            System.out.println(key+"=>"+value);

        }
    }
}
