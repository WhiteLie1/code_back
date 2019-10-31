package cn.itcast.day04.demo01.Polymorphism;
/*
代码中体现多态性，其实就是一句话，父类引用指向子类对象
格式：
父类名称 对象名 = new 子类名称();
或者
接口名称 对象名 = new 实现类名称()

在多态的代码当中，成员的方法的访问规则是。
看new的是谁，就优先用谁，没有则向上查找

口诀：
    编译看左边，运行看右边

对比一下：
成员变量：编译看左边，运行还是看左边
成员方法：编译看左边，运行看右边
 */
public class Demo01Multi {
    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
        //编译看左边，左边是Fu,Fu中没有methodZi方法，所以编译报错
//        obj.methodZi();
    }
}
