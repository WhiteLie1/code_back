package cn.itcast.day04.demo01.arrayList;

import java.util.ArrayList;

/** <E> 范形
 * 数组的长度不可以改变
 * arraylist集合的长度可以发生改变
 * 对于ArrayList来说，有一个尖括号<E>代表范形
 * 范型，也就是装在集合当中的所有元素，全都是统一的类型
 * 注意：范型只能是引用类型，不能是基本类型
 *
 *对于Arraylist集合来说，直接打印得到的不是地址值，而是内容
 * 如果内容是空，得到的是空的大括号
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合中添加一些数据，需要用到add方法
        list.add("赵丽颖");
        System.out.println(list);
        list.add("迪丽热巴");
        list.add("迪丽efsf热巴");
        list.add("迪丽sdfsdfsdf 热巴");
        System.out.println(list);
    }


}
