package cn.itcast.day04.demo01.Extends.Demo06This;

public class Zi extends Fu {
    int num = 20;
    @Override
    public void method(){

    }
    public void show(){
        int num=30;
        System.out.println(num);//30
        System.out.println(this.num);//20
        System.out.println(super.num);//10
        System.out.println("子类方法 ");
    }
}
