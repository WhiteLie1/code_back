package cn.itcast.day04.demo01.Interface;
/*
1.接口的默认方法，可以通过接口的实现类的对象，直接调用
2.接口的默认的方法，也可以被接口实现类进行覆盖重写
 */
public class Demo02Interface {
    public static void main(String[] args) {
        //创建了实现类的对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();//调用抽象方法，实际运行的是右侧的实现类
        //调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();

        System.out.println("===========");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();

    }
}
