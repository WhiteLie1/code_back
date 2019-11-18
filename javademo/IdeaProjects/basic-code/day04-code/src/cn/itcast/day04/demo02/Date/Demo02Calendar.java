package cn.itcast.day04.demo02.Date;

import java.util.Calendar;

/*
日历类：
    提供了许多的日历操作字段的方法
 */
public class Demo02Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // 多态
        System.out.println(c);
    }
}
