package cn.itcast.day04.demo04.Thread.demo01.waitAndNotify;
/*
    测试类：
     包含main方法，程序执行的入口，启动程序
     创建包子对象；
     创建包子铺线程，开启，生产包子;
     创建吃货线程，开启，吃包子

 */
public class Demotest {
    public static void main(String[] args) {
        // 创建包子对象;
        BaoZi bz = new BaoZi();
        // 创建包子铺线程，开启，生产包子;
        new BaoZiPu(bz).start();
        // 创建吃货线程，开启，吃包子
        new ChiHuo(bz).start();
    }
}