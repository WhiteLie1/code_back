package cn.itcast.day04.demo04.Thread.demo07.Synchronized.ThreadSafe;
/*
    实现卖票案例：
 */
public class RunnableImpl implements Runnable{
    // 定义一个多个线程共享的资源
    private int ticket = 10;
    //设置线程任务，卖票
    @Override
    public void run() {
        // 使用死循环，让卖票操作重复进行
        while (true) {
            // 先判断票是否存在
            if (ticket > 0) {
                // 票存在，ticket--
                System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
