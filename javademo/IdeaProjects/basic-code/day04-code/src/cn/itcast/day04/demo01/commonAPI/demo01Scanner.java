package cn.itcast.day04.demo01.commonAPI;

import java.util.Scanner;

/**
 * scanner类的功能，可以实现键盘输入数据，到程序当中去
 * 引用类型的使用步骤：
 * 1.导包
 *  import　包路径．类名称
 *  如果需要使用的目标类，和当前的类在同一个类当中，则可以省略语句不写
 *  只有ｊａｖａ．ｌａｎｇ包下的内容不需要导包，其他的包都需要ｉｍｐｏｒｔ
 *
 * 2.创建
 * 类名称　对象名　＝　ｎｅｗ　类名称（）
 *
 * 3.使用
 * 对象名．成员方法名（）
 * 获取键盘输入的一个int数字，int num = sc.nextInt()
 * 获取键盘输入的一个字符串，String str = sc.next()
 */
public class demo01Scanner {
    public static void main(String[] args) {
        //创建 System.in 代表从键盘输入
        Scanner sc = new Scanner(System.in);

        //获取int数字
        int num = sc.nextInt();
        System.out.println("输入的数字是："+num);
        //字符串
        String str = sc.next();
        System.out.println("输入的字符串是："+str);

    }
}


















