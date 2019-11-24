package cn.itcast.day04.demo03.collection;

import java.util.ArrayList;

/*

 */
public class Demo03Foreach {
    public static void main(String[] args) {
        demo2();
    }

    private static void demo2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s :list){
            System.out.println(s);
        }

    }

    // 使用for循环遍历数组
    private static void demo() {
        int[] arr = {1,2,3,4,5};
        for (int i:arr){ //
            System.out.println(i);
        }
    }

}
