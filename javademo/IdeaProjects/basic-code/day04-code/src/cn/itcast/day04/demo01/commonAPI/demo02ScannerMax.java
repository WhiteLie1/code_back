package cn.itcast.day04.demo01.commonAPI;

import java.util.Scanner;

/**
 * 键盘输入3个数字求最大值
 */
public class demo02ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();
        //首先得到两个数字当中的最大值
        int temp = a>b?a:b;
        int max = temp>c?temp:c;

        System.out.println("最大结果是："+max);
    }
}
