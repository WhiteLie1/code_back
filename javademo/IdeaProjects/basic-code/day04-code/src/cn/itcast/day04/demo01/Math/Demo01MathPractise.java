package cn.itcast.day04.demo01.Math;
/*
计算 -10.8到5.9之间的绝对值大于6或者＜2.1的整数有多少个
Math.ceil方法，得到的是一个double值
 */
public class Demo01MathPractise {
    public static void main(String[] args) {
        int Number = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int)min;  i < max ; i++) {
            int abs = Math.abs(i);
            if(abs>6 || abs <2.1){
                System.out.print(i+" ");
                Number++;
            }
        }
        System.out.println("总共有："+Number+"个");
    }
}
