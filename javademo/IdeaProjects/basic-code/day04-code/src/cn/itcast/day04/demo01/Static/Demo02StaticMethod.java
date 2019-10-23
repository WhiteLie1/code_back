package cn.itcast.day04.demo01.Static;
/*
一旦使用类static来修饰成员方法，那么就成为了静态方法；静态方法不属于对象，属于类
如果没有static关键字，那么必须先 创建对象，然后通过对象来使用它
如果有类static关键字，那么就不需要创建对象，而是直接通过类名称来使用

无论是成员变量还是成员方法，如果有了static，都推荐使用类名称进行调用
静态变量：类名称.静态变量
静态方法：类名称.静态方法()

注意事项：
1.静态不能直接访问非静态
原因：因为在内存当中是【先】有的静态方法，【后】有的非静态内容
”先人不知道后人，但是后人知道先人“
2.静态方法 当中不能使用this
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先，创建对象
        //然后，使用没有static关键字的内容
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        obj.methodStatic();
        MyClass.methodStatic();

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
    }
    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}
