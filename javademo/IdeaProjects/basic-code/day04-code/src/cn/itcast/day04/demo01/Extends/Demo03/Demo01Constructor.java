package cn.itcast.day04.demo01.Extends.Demo03;
/*
继承关系中，父子类构造方法访问特点：
1.子类构造方法中，有一个默认的“super()"调用，所以一定是先调用父类构造函数，后执行的子类构造
2.子类构造可以通过super关键字来调用父类重载构造
3.super的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造

总结：子类必须调用父类构造方法，不写则赠送super(),写了则用写了的super调用。super只能有一个，还必须是第一个
 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
