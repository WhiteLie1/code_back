package cn.itcast.day04.demo01.Interface;

public interface Demo07MyInterface {
    public default void method(){
        System.out.println("接口的默认方法！");
    }
}
