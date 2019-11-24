package cn.itcast.day04.demo03.collection;

import java.util.ArrayList;
import java.util.Collection;

/*

 */
public class Demo01Collection {
    public static void main(String[] args) {
        // 创建集合对象 使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll); // 重写了toString方法
        /*

         */
        boolean b1 = coll.add("zhangsan");
        System.out.println("b1:"+b1); // 一般都是返回true,没意义
        System.out.println(coll);

        coll.add("张三");
        coll.add("李四");
        System.out.println(coll);

        boolean b2 = coll.remove("李四"); // true
        System.out.println("b2:"+b2);
        System.out.println(coll);

        //判断集合里面是否包含该元素
        boolean b4 = coll.contains("zhangsan");
        System.out.println(b4);

        // 判断是否为空
        boolean b6 = coll.isEmpty();
        System.out.println("b6:"+b6);

    }
}
