package cn.itcast.day04.demo01.anonymous;

import java.util.Scanner;

/**
 *
 */
public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是"+num);
        //使用匿名对象来进行传参
        //mehtodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是："+num);




    }
    public static void mehtodParam(Scanner sc){
//        int num = sc.nextInt();
//        System.out.println("输入的是："+num);
    }

    public static Scanner methodReturn(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
}
