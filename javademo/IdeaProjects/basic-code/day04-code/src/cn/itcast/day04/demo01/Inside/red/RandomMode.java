package cn.itcast.day04.demo01.Inside.red;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
           ArrayList<Integer> list = new ArrayList<>();
           // 随机分配，可能多可能少
          //最少1分钱，最多不超过“剩下金额的平均数的2倍”
        //第一次发红包，随机范围是0.01到6.66元
        //第一次发完了以后，剩下的至少是3.34元
        // 此时还需要再发两个红包
        // 此时的再发的范围因该是0.01到3.34元（取不到右边，剩下0.01）

        // 总结一下，范围的公式是：1+random.nextInt(leftMoney/LeftCount *2)+1;
        Random r = new Random(); // 随机生成器
        // totalmoney总金额，totalcount总份数，不变的
        // 额外再定义两个变量，分别代表剩下多少钱，剩下多少份

        int leftMoney = totalMoney;
        int leftCount = totalCount;
        // 随机发前N-1个，最后不需要用随机
        for (int i = 0; i < totalCount-1; i++) {
            // 按公式随机生成金额
            int money = r.nextInt(leftMoney/leftCount*2)+1;
            list.add(money); // 将一个随机红包放进集合
            leftMoney -= money; // 红包越发越少
            leftCount--; // 剩下的还因该再发的个数，递减
        }
        return null;
    }
}
