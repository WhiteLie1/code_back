package cn.itcast.day04.demo01.demo03;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price=9999;
        one.color="土豪金";
        method(one);
    }
    public static void method(Phone paeam){
        System.out.println(paeam.brand);
        System.out.println(paeam.price);
        System.out.println(paeam.color);
    }
}
