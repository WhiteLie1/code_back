package cn.itcast.day04.demo01.Static;
/*
一旦使用类static来修饰成员方法，那么就成为了静态方法；静态方法不属于对象，属于类
如果没有static关键字，那么必须先 创建对象，然后通过对象来使用它
如果有类static关键字，那么就不需要创建对象，而是直接通过类名称来使用

无论是成员变量还是成员方法，如果有了static，都推荐使用类名称进行调用
静态变量：类名称.静态变量
静态方法：类名称.静态方法()
 */
public class MyClass {
    int num;
    static int numStatic;
    public void method(){
        System.out.println("这是一个成员的方法：");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }
    //静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法。");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态不能直接访问非静态
//        System.out.println(num);
        //静态方法中不能使用this关键字
//        System.out.println(this);//错误写法
    }
}
