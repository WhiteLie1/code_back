package cn.itcast.day04.demo03.doudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    斗地主综合案例：
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        // 1.准备牌
        // 准备54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        // 定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
        String[] colors = {"♠","♣","♦","♥"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        // 先把大小王存储到pocker中去
        poker.add("大王");
        poker.add("小王");
        //     循环嵌套两个数组，组装52张牌
        for (String number : numbers){
            for (String color:colors){
//                System.out.print(color+number);
                // 把组装好的牌放到poker里面
                poker.add(color+number);
            }
        }
//        System.out.println(poker);

        // 2.洗牌 使用集合的工具类 collections中的方法， 使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);
//        System.out.println(poker);
        // 定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        /*3.
        发牌：
            定义4个集合，存储玩家的牌和底牌
            使用pocker集合的索引 %3 给3个玩家轮流发牌
         */
        for (int i = 0; i < poker.size(); i++) {
            // 获取每一张牌
            String p = poker.get(i);
            // 轮流发牌
            if(i>=51){
                // 给底牌发牌
                diPai.add(p);
            }else if(i%3==0){
                // 给玩家发牌
                player01.add(p);
            }else if(i%3==1){
                // 给玩家发牌
                player02.add(p);
            }else if(i%3==2){
                // 给玩家发牌
                player03.add(p);
            }

        }
        // 4,看牌
        System.out.println("A"+player01);
        System.out.println("B"+player02);
        System.out.println("C"+player03);
        System.out.println("D"+diPai);

    }
}
