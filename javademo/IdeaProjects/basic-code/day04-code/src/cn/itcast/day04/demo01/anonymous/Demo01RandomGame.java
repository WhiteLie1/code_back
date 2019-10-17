package cn.itcast.day04.demo01.anonymous;

import java.util.Random;
import java.util.Scanner;

/*
猜数字小游戏
 */
public class Demo01RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randNum = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("这是一个0-100的数字，请输入你要猜测的数字：");
            int gussNum = sc.nextInt();
            if(gussNum>randNum){
                System.out.println("太大了,请重试");
            }else if(gussNum<randNum){
                System.out.println("太小了，请重试");
            }else{
                System.out.println("恭喜你，答对了");
                break;
            }
        }
        System.out.println("游戏结束！");
    }

}
