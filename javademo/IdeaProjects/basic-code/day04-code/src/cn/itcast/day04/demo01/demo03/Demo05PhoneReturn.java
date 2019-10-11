package cn.itcast.day04.demo01.demo03;

import java.util.function.DoubleToIntFunction;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println(two.brand);
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand="苹果";
        one.color="玫瑰金";
        one.price = 9990;
        return one;
    }
}
