package cn.itcast.day04.demo01.Static;
/*
静态代码块的格式是：
public class 类名称{
    static{
        //静态代码块的内容
    }
}
特点：
当第一次用到本类的时候，静态代码将执行唯一的一次
静态内容总是优先于非静态
静态代码快的典型用途：
用来一次性的堆静态成员变量进行赋值
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();


    }
}
