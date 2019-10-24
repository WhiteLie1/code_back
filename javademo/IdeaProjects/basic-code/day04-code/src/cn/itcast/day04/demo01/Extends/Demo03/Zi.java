package cn.itcast.day04.demo01.Extends.Demo03;

public class Zi extends Fu {
    public  Zi(){
//        super();//调用父类的无参构造方法
        super(20);
        System.out.println("子类构造方法！");
    }
    public void method(){
//        super();//错误写法，只有子类构造方法才能调用父类构造方法
    }
}
