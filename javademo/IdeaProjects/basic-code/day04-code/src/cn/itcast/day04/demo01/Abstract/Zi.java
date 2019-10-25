package cn.itcast.day04.demo01.Abstract;

public class Zi extends Fu {
    public Zi(){
        System.out.println("子类构造方法执行");
    }
    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
