package cn.itcast.day04.demo04.Thread.demo07.Synchronized2.ThreadSafe.ThreadSafe;

/*
    模拟买票案例
    创建三个线程，同时开启，对共享的票进行出售
    出现了安全问题，卖出了重复的票
    解决线程安全问题的第二种方案：使用同步方法
        使用步骤：
            1.把访问了共享数据的代码抽取出来，放到一个方法中
            2.在方法上添加synchtonized修饰符
         格式：
            定义方法的格式
            修饰符：synchronized 返回值类型 方法名(参数列表){
                可能会出现线程安全问题的代码，访问了共享的数据的代码
            }

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
