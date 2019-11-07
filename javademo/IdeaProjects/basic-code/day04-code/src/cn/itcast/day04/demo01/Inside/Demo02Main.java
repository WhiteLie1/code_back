package cn.itcast.day04.demo01.Inside;
/*
如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

匿名内部类的定义格式
接口名称 对象名 = new 接口名称（）{
    覆盖重写所有抽象方法
}；
 */
public class Demo02Main {
    public static void main(String[] args) {
//        MyInterfaceImpl obj  = new MyInterfaceImpl();
//        obj.method();
//        MyInterface some = new MyInterface(); // 错误写法
         // 使用匿名内部类的方法
        // 使用匿名内部类，但不是匿名对象，对象名称就叫做objA
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法A111");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法A222");
            }
        };

        objA.method1();
        objA.method2();
        System.out.println("======================");
        // 使用匿名内部类的方法
//        MyInterface objB = new MyInterface() {
        // 使用了匿名内部类，而且省略了对象名称，也是匿名对象
      new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法B111");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法B222");
            }
        }.method1();
      // 因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法B111");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法B222");
            }
        }.method2();

//        objB.method1();
//        objB.method2();

    }
}
