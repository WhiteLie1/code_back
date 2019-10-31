package cn.itcast.day04.demo01.Polymorphism;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    //子类特有的方法
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}
