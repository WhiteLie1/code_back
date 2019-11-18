package cn.itcast.day04.demo02.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
调用日期时间api,来计算出一个人已经出生了多少天
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        // 1。使用scanner来获取出生日期
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入出生的日期，格式：yyyy-MM-dd");
        String birthdayString = scanner.next();
        // 2,使用dataParse来把字符串的出生日期解析为date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(birthdayString);
        // 3.把date格式的出生日期改为毫秒值
        long birthdayDateTime = birthday.getTime();
        // 获取当前的日期，转换为毫秒值
        long todayTime = new Date().getTime();
        // 用当前日期的毫秒值减去出生日期的毫秒值
        long time = todayTime-birthdayDateTime;
        System.out.println(time/1000/60/60/24/365);
    }
}
