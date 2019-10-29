package cn.itcast.day04.demo01.Interface;

public class Demo01Interface {
    public static void main(String[] args) {
        //创建实现类的对象
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        //创建实现类的对象使用
        impl.methodAbstract1();
        impl.methodAbstract2();
        impl.methodAbstract3();
        impl.methodAbstract4();


    }
}

