package cn.itcast.day04.demo01.Interface;
/*
在任何版本的java中，接口都能定义抽象方法
格式：
    public abstract 返回值类型 方法名称（参数列表）
注意事项：
1.接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
2.这两个关键字修饰符，可以选择性的忽略
 */
public interface MyInterfaceAbstract {
    //这是一个抽象方法
    public abstract void methodAbstract1();
    //这是一个抽象方法
     abstract void methodAbstract2();
    //这是一个抽象方法
    public  void methodAbstract3();
    //这是一个抽象方法
    void methodAbstract4();
}
