package cn.itcast.day04.demo01.arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 *
 */
public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //遍历集合
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
