package cn.itcast.day04.demo01.Math;
/*
java.util.math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
public static double abs(double num):获取绝对值 有多种重载
public static double ceil(double num):向上取整
                     floor           向下取整
              long round(double num)：四舍五入
 */
public class Demo01Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(34.2));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-43));
        System.out.println("=================");
        //向上取整
        System.out.println(Math.ceil(3.9));//4.0
        System.out.println(Math.ceil(3.1));//4.0
        System.out.println(Math.ceil(3.0));//3.0
        System.out.println("-===============");
        //向下取整 抹零
        System.out.println(Math.floor(30.1));//30.0
        System.out.println(Math.floor(30.9));//30.0
        System.out.println(Math.floor(30.0));//30.0
        System.out.println("-===============");
        //四舍五入
        System.out.println(Math.round(20.4));//20
        System.out.println(Math.round(11.5));//12

    }
}
