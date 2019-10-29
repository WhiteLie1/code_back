package cn.itcast.day04.demo01.Interface;

public interface Demo07MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();
    public default void methodDefault(){
        System.out.println("AAA");
    }
}
