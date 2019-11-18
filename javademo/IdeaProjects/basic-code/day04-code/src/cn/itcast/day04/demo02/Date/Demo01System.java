package cn.itcast.day04.demo02.Date;


import java.util.ArrayList;
import java.util.Arrays;

/*

 */
public class Demo01System {
    public static void main(String[] args) {

        demo02();

    }
    /*
    将数组中的指定的数据拷贝到另一个数组中去
     */
    private static void demo02() {
        int [] src = {1,2,3,4,5};
        int [] dest  = {6,7,8,9,10};
        System.out.println("输出前"+ Arrays.toString(dest));

        System.arraycopy(src,0,dest,0,3);
        System.out.println("输出后"+ Arrays.toString(dest));
    }

    private static void demo01() {
        /*
        返回以毫秒为单位的当前时间
        用来验证程序的效率
        验证 打印1-9999所要的时间
         */
        long s = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("共耗时"+(e-s));
    }

}
