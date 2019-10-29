package cn.itcast.day04.demo01.Interface;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法！");

    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中的冲突的默认方法进行了覆盖重写");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法！");

    }
}
