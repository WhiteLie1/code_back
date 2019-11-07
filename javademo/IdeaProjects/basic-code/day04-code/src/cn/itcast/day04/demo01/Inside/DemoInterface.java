package cn.itcast.day04.demo01.Inside;

import java.util.ArrayList;
import java.util.List;

/*
java.util.list正是ArrayList所实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        // 左边是接口名称，右边是实现类的名称，这就是多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out. println(result.get(i));
        }


    }
    // 方法
    public static List<String> addName(List<String> list){
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        return list;
    }
}
