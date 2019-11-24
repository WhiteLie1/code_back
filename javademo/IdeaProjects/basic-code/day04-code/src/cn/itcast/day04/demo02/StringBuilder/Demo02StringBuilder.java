package cn.itcast.day04.demo02.StringBuilder;
/*

 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        // 创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        // 使用append方法往里面添加数据
        StringBuilder bu2 = bu.append("abc");
        System.out.println(bu);
        System.out.println(bu2);
        System.out.println(bu==bu2);

        // 使用append方法无需接收返回值
        bu.append("sddsjfgksgjskl");
        System.out.println(bu);

        // 链式编程：方法返回值是一个对象，可以继续调用方法
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu.append("abc").append(1).append(8.8).append("zhong");
        System.out.println(bu);



    }
}
