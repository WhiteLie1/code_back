package cn.itcast.day04.demo01.Polymorphism;
/*
向上转型一定是安全的，没有问题的，正确的，但是有一个弊端，
对象一旦向上转型为父类，那么就无法调用子类原本特有的内容
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是，父类引用指向子类对象
        Animal animal = new Cat();//本来创建是时候是一只猫
        animal.eat();//猫吃鱼
//        animal.catchMouse(); // 错误的写法
        //向下转型，进行“还原”动作
        Cat cat = (Cat)animal;
        cat.catchMouse();

        //下面是错误的转型方法
        //本来new的时候是一只猫，现在非要当做狗
        //java.lang.ClassCastException: 类转换异常
        Dog dog = (Dog)animal;//类转换异常。  错误的写法，编译不会报错，但是运行会出现异常


    }
}
