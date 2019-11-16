package cn.itcast.day04.demo02.Date;

import java.util.Date;

/*

 */
public class Demo02Date {
    public static void main(String[] args){
        demo01();
    }

    /*
    data类的空参数构造方法
    date()获取当前系统的日期和时间
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
