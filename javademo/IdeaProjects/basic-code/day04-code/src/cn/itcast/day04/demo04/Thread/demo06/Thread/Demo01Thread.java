package cn.itcast.day04.demo04.Thread.demo06.Thread;
/*
    创建多线程程序的第一种方式：
 */
public class Demo01Thread {
    public static void main(String[] args) {
        // 3.创建Thread类的子类对象
        MyThread mt = new MyThread();
        // 4.执行
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
