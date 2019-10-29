package cn.itcast.day04.demo01.Interface;
/*
这个子接口当中有几个方法？答：4个
methodA来源于接口A
methodB来源于接口B
methodCommon 同时来源于接口A和B
method 来源于我自己
 */
public interface Demo07_1_MyInterface extends Demo07MyInterfaceA,Demo07MyInterfaceB{
    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
