package cn.itcast.day04.demo04.Thread.demo04Runnable;
/*
    创建多线程程序的第二种方式：实现Runnable接口
    java.lang.Runnable
        Runnable 接口应该由哪些打算通过某一线程执行其实例的类来实现，类必须定义一个称为run的无参数方法
        java.lang.thread类的构造方法
 */
public class Demo01Runable {
    public static void main(String[] args) {
        // 3.创建一个Runable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        // 4.创建一个Thread类对象，构造方法中传递Runnable接口的实现类对象
//        Thread t = new Thread(run); // 打印线程名称
        Thread t = new Thread(new RunnableImpl2()); // 答应HelloWorld
        // 5.调用thread类中的start方法，开启新的线程执行run方法
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}
