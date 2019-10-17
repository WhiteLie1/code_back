package cn.itcast.day04.demo01.anonymous;

import java.util.Random;

/**
 * Random类用来产生随机数字
 *
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
//        int num = r.nextInt();
//        System.out.println("随机数是："+num);

//        for (int i = 0;i<100;i++){
//            int num = r.nextInt(10);
//            System.out.println(num);
//        }

        //根据int变量n的值，范围是[1,n]
        int num = 5;
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(num)+1;
            System.out.println(result);
        }

    }
}
