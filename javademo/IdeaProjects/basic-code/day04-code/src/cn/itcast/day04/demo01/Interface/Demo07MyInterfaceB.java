package cn.itcast.day04.demo01.Interface;

public interface Demo07MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default void methodDefault(){
        System.out.println("BBB");
    }

}
