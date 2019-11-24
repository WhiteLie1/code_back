package cn.itcast.day04.demo03.generic;

import javax.swing.*;

/*

 */
public class Demo02GenericClass {
    public static void main(String[] args) {
        // 不写泛型，默认就是object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object object = gc.getName();
        System.out.println(gc);

        // 创建genericaclass对象
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);

        Integer name = gc2.getName();
        System.out.println(name);

        // 泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("小米");
        String name1 = gc3.getName();
        System.out.println(name1);

    }
}
