package cn.itcast.day04.demo01.Interface;

public class Demo03Interface {
    public static void main(String[] args) {
        //创建了实现类的对象
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        //错误的写法
//        impl.methodStatic();
        //直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
