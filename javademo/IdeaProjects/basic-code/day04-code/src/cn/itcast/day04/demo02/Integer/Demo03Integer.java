package cn.itcast.day04.demo02.Integer;

import org.w3c.dom.ls.LSOutput;

public class Demo03Integer {
    public static void main(String[] args) {
        // 基本类型->字符串(String)
        int i1 = 100;
        String s1 = i1+"";
        System.out.println(s1+200); // 100200
        System.out.println("---------------------");
        String s2 = Integer.toString(100);
        System.out.println(s2+200); // 100200

        String s3 = String.valueOf(100);
        System.out.println(s3+200);
        // 字符串变成基本类型
        int i = Integer.parseInt(s1);
        System.out.println(i);


    }


}
