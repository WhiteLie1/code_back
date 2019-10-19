package cn.itcast.day04.demo01.arrayList;

import java.util.ArrayList;
import java.util.Random;

/*
以指定的格式打印集合的方法ArrayList类型作为参数，使用{}括起集合，使用@分离每个元素
 */
public class Demo05ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("的手机发生的");
        list.add("sdfsdfd");
        list.add("的沙发上看");
        System.out.println(list);
        printArrayList(list);


    }
    /*
    定义方法的三要素：
    1.返回值类型：只是进行打印而已，没有运算，没有结果，所以用void
    方法名称：
    参数列表
     */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for(int i = 0;i<list.size();i++){
            String name = list.get(i);
            if(i == list.size()-1){
                System.out.println(name+"}");
            }else {
                System.out.print(name + "@");
            }
        }
    }
}
