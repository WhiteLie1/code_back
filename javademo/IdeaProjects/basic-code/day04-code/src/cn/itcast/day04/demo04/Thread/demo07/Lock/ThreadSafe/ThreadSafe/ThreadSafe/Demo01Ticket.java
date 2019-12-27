package cn.itcast.day04.demo04.Thread.demo07.Lock.ThreadSafe.ThreadSafe.ThreadSafe;

/*
    模拟买票案例
    创建三个线程，同时开启，对共享的票进行出售
    出现了安全问题，卖出了重复的票
    解决线程安全问题的第三种方案：Lock锁
        使用步骤：
            1.在成员位置创建一个ReentrantLock对象
            2.在可能出现安全问题代码前调用Lock接口的lock获取锁
            3.在可能出现安全问题代码后调用Lock接口的unlock获取锁


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
