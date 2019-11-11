package cn.itcast.day04.demo01.Inside.red;

import java.util.ArrayList;

/*
场景说明：
    红包发出之后，所有人都有红包，大家抢完了，最后一个留给群主
    大多数代码为现成的，我们需要直接调用就好了

红包分发的策略：
    1.普通红包（平均）： totalMoney/toalCount,余数放在最后一个红包中
    2.手气红包（随机）：最少1分钱，最多不超过平均数的两倍，应该越发越少
 */
public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("三金公司");

        // 设置群主名
        red.setOwnerName("王思聪");

        // 普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

        //手气红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);


    }

}
