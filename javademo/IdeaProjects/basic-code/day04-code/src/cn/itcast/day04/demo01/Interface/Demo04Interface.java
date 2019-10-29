package cn.itcast.day04.demo01.Interface;

public class Demo04Interface {
    public static void main(String[] args) {
        MyInterfacePrivateB.methodStatic1();
        MyInterfacePrivateB.methodStatic2();
        //错误的写法，这是一个private方法 无法直接访问
//        MyInterfacePrivateB.methodStaticCommon();
    }
}
