package cn.itcast.day04.demo03.Map;

import java.util.HashMap;
import java.util.Map;

/*
Map是一个双列集合
 */
public class Demo01Map       {
    public static void main(String[] args) {
        show04();
    }
    /*
    判断集合是否包含指定的键
     */
    private static void show04() {
        // 创建一个map集合
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        boolean b1 = map.containsKey("赵丽颖");
        System.out.println("b1:"+b1); // b1:true
    }

    /*
        根据指定的键，在Map集合中获取对应的值
        key存在，返回对应的value的值
        key不存在则返回null
     */
    private static void show03() {
        // 创建一个map集合
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        Integer v1 = map.get("杨颖");
        System.out.println("v1:"+v1); //v1:165

    }

    /*
        把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除的元素的值
        返回值：v
            key存在，v返回被删除的值
            key不存在，v返回null
     */
    private static void show02() {
        // 创建一个map集合
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map); // {林志玲=178, 赵丽颖=168, 杨颖=165}

        Integer v1 = map.remove("林志玲");
        System.out.println("v1:"+v1);// v1:178
        System.out.println(map); // {赵丽颖=168, 杨颖=165}
    }

    /*
     put方法，把指定的键与指定的值对添加到Map集合中去
     返回值：V
        存储键值对的时候，key不重复，返回值是null
        存储键值对的时候，key重复，会使用新的value替换map中重复的value,返回被替换的value的值
     */
    private static void show01() {
        // 创建map集合对象，多态
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("李晨","范冰冰1");
        System.out.println("v1:"+v1);//v1:null

        String v2 = map.put("李晨","范冰冰2");
        System.out.println("v2:"+v2);//v2:范冰冰1

        System.out.println(map);//{李晨=范冰冰2}

        map.put("冷峰","龙小云");
        map.put("杨过","小龙女");
        map.put("尹志平","小龙女");
        System.out.println(map);;

    }

}
