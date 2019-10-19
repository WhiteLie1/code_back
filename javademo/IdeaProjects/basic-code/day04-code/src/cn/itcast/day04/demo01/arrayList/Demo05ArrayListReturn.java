package cn.itcast.day04.demo01.arrayList;

import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合存入20个随即数字，然后筛选其中的偶数元素，放到小集合中
 */
public class Demo05ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for(int i = 0;i<20;i++){
            int num = r.nextInt(100)+1;
            biglist.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(biglist);
        System.out.println("偶数总共有："+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
        
    }
    //这个方法，接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> biglist){
        //创建一个小集合，用来装偶数结果
        ArrayList<Integer> smallList = new ArrayList<>();

        for (int i = 0; i < biglist.size(); i++) {
            int num = biglist.get(i);
            if(num %2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
