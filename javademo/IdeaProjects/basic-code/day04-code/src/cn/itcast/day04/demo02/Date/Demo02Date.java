package cn.itcast.day04.demo02.Date;

import java.util.Date;

/*

 */
public class Demo02Date {
    public static void main(String[] args){
        demo03();
//        demo01();
    }
    /*
    long gettime() 把日期转换为毫秒值
     */
    private static void demo03() {
    }

    /*
     data类的带参数的构造方法
     date(long date):传递毫秒值，把毫秒值转换为Date日期
     */
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date); // Thu Jan 01 08:00:00 CST 1970

        date = new Date(1573652032572L);
        System.out.println(date);
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
