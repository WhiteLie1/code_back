package cn.itcast.day04.demo04.Thread.demo07.Synchronized.ThreadSafe;

/*
    模拟买票案例
    创建三个线程，同时开启，对共享的票进行出售
    出现了安全问题，卖出了重复的票
    解决线程安全问题的一种方案：使用同步代码块
        格式：
            synchronized(锁对象){
                可能会出现的线程安全问题的代码(访问了共享数据库)
            }
        注意：
            1.通过代码块中的锁对象，可以使用任意的对象
            2.但是必须保证多个线程使用的锁对象是同一个
            3 .锁对象作用：
                把同步代码块锁住，只让一个线程在同步代码块中执行

 */
public class Demo01Ticket {
    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        // 创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2= new Thread(run);
        // 调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();
    }



}
