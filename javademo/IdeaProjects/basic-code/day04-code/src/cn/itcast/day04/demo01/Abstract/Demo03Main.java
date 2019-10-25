package cn.itcast.day04.demo01.Abstract;

public class Demo03Main {
    public static void main(String[] args) {
//        Animal01 animal01 = new Animal01(); 错误的写法
//        Dog01 dog01 = new Dog01(); 错误 这个也是抽象类
        Dog2Ha dog2Ha = new Dog2Ha();//这是普通类，可以直接new对象
        dog2Ha.sleep();
        dog2Ha.eat();
        System.out.println("======================");
        DogGolden dogGolden = new DogGolden();
        dogGolden.eat();
        dogGolden.sleep();
    }
}
