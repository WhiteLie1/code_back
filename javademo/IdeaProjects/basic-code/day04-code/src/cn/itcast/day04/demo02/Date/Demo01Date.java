package cn.itcast.day04.demo02.Date;
/*
java.util.Date 代表日期和时间的类
毫秒值的计算，用来计算时间和日期
时间原点为 1970年1月1日

把毫秒转换为日期关系
把毫秒转换为日期：
    1天 = 24*60*60=86400秒= 86400*1000毫秒
 */
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println((System.currentTimeMillis()/(86400*1000))/365); // 1573652032572
        System.out.println(1970+49);

    }
}
