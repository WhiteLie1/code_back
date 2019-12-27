package cn.itcast.day04.demo04.Thread.demo07.Lock.ThreadSafe.ThreadSafe.ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    实现卖票案例：
 */
public class RunnableImpl implements Runnable{
    // 定义一个多个线程共享的资源
    private  static int ticket = 50;
    // 1.再成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();
    //设置线程任务，卖票
    @Override
    public void run() {
        // 使用死循环，让 卖票操作重复进行
        while (true) {
//            2.在可能出现安全问题代码前调用Lock接口的lock获取锁
            l.lock();
            payTicketStatic();
//            3.在可能出现安全问题代码后调用Lock接口的unlock获取锁
            l.unlock();
        }
    }
    /*
        静态的同步方法：
            锁对象是谁？
            不能是this
            this是创建对象之后产生的，静态方法优先于对象
            静态方法的锁对象是本类的class属性--->class文件对象(反射)
            
     */
    public static synchronized void payTicketStatic(){
        // 先判断票是否存在
        if (ticket > 0) {
            // 为提高安全问题出现的概率，让程序睡眠、
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 票存在，ticket--
            System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
            ticket--;
        }
    }
    /*
        定义一个同步方法：
            同步方法也会把方法内部的代码块锁住
            只让一个线程执行
            同步方法的锁对象是谁？
            就是实现类对象 new RunnableImpl()
            也就是 this

     */
    public synchronized void payTicket(){
        // 先判断票是否存在
        if (ticket > 0) {
            // 为提高安全问题出现的概率，让程序睡眠、
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 票存在，ticket--
            System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
            ticket--;
        }
    }

}
