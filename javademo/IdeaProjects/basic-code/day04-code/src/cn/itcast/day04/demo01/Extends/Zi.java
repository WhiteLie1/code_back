package cn.itcast.day04.demo01.Extends;

public class Zi extends Fu {
    int numZi = 20;
    int num=200;
    public void methodZi(){
        //因为本类当中有，则用自己的类方法
        System.out.println(num);
    }

}
