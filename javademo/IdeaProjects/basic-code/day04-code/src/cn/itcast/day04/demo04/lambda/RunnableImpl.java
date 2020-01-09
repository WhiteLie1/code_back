package cn.itcast.day04.demo04.lambda;
/*
    创建Runnable的实现类，重写run方法，设置线程任务

 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新的线程创建了");
    }
}
