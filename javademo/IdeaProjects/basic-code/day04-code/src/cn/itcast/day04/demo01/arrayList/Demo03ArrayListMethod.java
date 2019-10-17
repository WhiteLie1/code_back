package cn.itcast.day04.demo01.arrayList;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

/**
 *Arraylist当中的常用方法：
 * public boolean add(E e):向集合中添加元素，参数的类型和泛型一致 ===> 返回值代表的添加是否成功
 * 备注：对于Arraylist集合来说，add添加动作一定是成功的，所以返回可用可不用
 * 但是对于其他集合来说，add添加动作不一定成功
 * public E get(int index):从集合中获取元素，参数是索引编号，返回值就是对应位置的元素
 * public E remove(int index)从集合中删除元素，参数是索引编号，返回值就是被删除的元素
 * public int size():获取集合的尺寸长度，返回值是集合当中包含的元素的个数
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //向集合中添加元素
        boolean success = list.add("是地方就是了");
        System.out.println(list);
        System.out.println("添加的动作是否成功："+success);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        //从集合中获取元素，get,索引值从0开始
        String name = list.get(2);
        System.out.println(name);
        //从集合中删除元素，remove
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是："+whoRemoved);
        System.out.println(list);

        int size = list.size();
        System.out.println("集合的长度是："+size);
    }

}
