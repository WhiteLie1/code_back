package cn.itcast.day04.demo01.Extends;
/*
在父子类的继承关系中，如果成员变量重名，则创建子类对象的时候，访问有两种访问方式：
1.直接通过子类对象来访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找
2.间接通过成员方法访问成员变量

 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        System.out.println("==============");
        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("===========");
        //等号左边是谁，就优先用谁
        System.out.println(zi.num);

        System.out.println("=============");
        zi.methodZi();
        zi.methodFu();

    }
}
