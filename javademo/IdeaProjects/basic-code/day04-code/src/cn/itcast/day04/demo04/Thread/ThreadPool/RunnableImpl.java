package cn.itcast.day04.demo04.Thread.ThreadPool;
/*
        2.创建一个类，实现Runnable接口，重写run方法，设置线程任务

 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        // 获取一下线程的名称
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行！");
    }
}
