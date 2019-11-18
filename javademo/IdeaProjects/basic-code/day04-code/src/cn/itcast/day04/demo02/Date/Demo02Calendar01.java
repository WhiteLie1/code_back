package cn.itcast.day04.demo02.Date;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar01 {
    public static void main(String[] args) {
        /*

         */
        demo04();

    }
    /*
    getTime 把日历转换为日期
     */
    private static void demo04() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }

    /*
    add 给定的日历规则，字段的增加
     */
    private static void demo03() {
        Calendar c = Calendar.getInstance();
        // 把年增加两年
        c.add(Calendar.YEAR,2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month); // 西方的月份 0-11
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    /*
        Public void set(int field,int value);将给指定的日历字段设置为定值
        int field 传递指定的日期字段
        int value 给指定的字段设置值
     */
    private static void demo02() {
        // 使用getInstance方法来获取calendar对象
        Calendar c = Calendar.getInstance();
        // 设置为 999
        c.set(Calendar.YEAR,9999);
        // 设置月
        c.set(Calendar.MONTH,9);
        //
        c.set(Calendar.DATE,9);

        // 同时设置年月日，使用set方法 使用方法的重载方法
        c.set(88,5,7);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month); // 西方的月份 0-11
        int date = c.get(Calendar.DATE);
        System.out.println(date);

    }

    /*
    public int get(int field)：返回给定日历字段的值
    参数：传递指定的日历字段、
     */
    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month); // 西方的月份 0-11
        int date = c.get(Calendar.DATE);
        System.out.println(date);
//        System.out.println(2088-2018);
    }
}
