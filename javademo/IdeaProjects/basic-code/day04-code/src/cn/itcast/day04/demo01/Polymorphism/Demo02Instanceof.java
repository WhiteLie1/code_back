package cn.itcast.day04.demo01.Polymorphism;
/*
如何才能知道，一个父类引用的对象，本来是什么子类？
格式：
对象：instanceof 类名称
这将会得到一个boolean结果，也就是判断前面的对象能不能当做后面类型的实例
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
//        Animal animal = new Cat();//本来是一只猫
//        animal.eat();// 猫吃鱼
        Animal animal = new Dog();//本来是一只狗
        animal.eat();// 狗吃shit


        giveMeAPet(new Cat());//你不知道传进去的是什么东西，所以先进行一个判断，然后再去依据传入参数的不同来调用不同的属性方法
    }
    public static void giveMeAPet(Animal animal){
        //如果希望调用子类的方法，需要向下转型
        //判断一下，父类引用animal本来是不是cat
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
    }
}
