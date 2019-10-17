package cn.itcast.day04.demo01.commonAPI;

import java.util.Scanner;

/**
 * 键盘输入两个数字求和
 */
public class demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("求和结果是："+(a+b));
    }
}
