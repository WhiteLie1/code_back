package cn.itcast.day04.demo01.Abstract;

import java.util.ArrayList;
//群主的类
public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //再看一下自己有多少钱
        int leftMoney = super.getMoney();
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;//返回空的集合
        }
        //扣钱
        super.setMoney(leftMoney-totalMoney);

        //发红包需要平均分成count份
        int avg = totalMoney/count;
        int mod = totalMoney%count;//余数，也就是剩下的零头
        //除不开的零头，包在最后一个红包中，也就是甩下的零头


        //除不尽的零头，包在最后一个红包中
        //洗面把红包一个个的放到集合当中去
        for (int i = 0; i < count; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
