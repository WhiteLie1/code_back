package cn.itcast.day04.demo01.Abstract;
//子类也是一个抽象类
public abstract class Dog01 extends Animal01 {
    @Override
    public void eat() {
        System.out.println("狗吃骨头！");

        //只对一个抽象方法进行了处理，对另外的一个没有理会
        //public static void sleep();
    }
}
