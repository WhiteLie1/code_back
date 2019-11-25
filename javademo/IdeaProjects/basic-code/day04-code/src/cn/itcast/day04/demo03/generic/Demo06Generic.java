package cn.itcast.day04.demo03.generic;

import java.util.ArrayList;
import java.util.Collection;

/*
    泛型的上线限定：？extend E 代表使用的泛型只能是E类型的子类/本身
    泛型的下线限定：super E 代表使用的泛型只能是E类型的父类/本身
 */
public class Demo06Generic {
    public static void main(String[] args) {
        Collection<Integer> lsit1 = new ArrayList<Integer>();
        Collection<String> lsit2 = new ArrayList<String>();
        Collection<Number> lsit3 = new ArrayList<Number>();
        Collection<Object> lsit4 = new ArrayList<Object>();

        getElement1(lsit1);
//        getElement1(lsit2); // 报错
        getElement1(lsit3);
//        getElement1(lsit4); // 报错

//        getElement2(lsit1); // 报错
//        getElement2(lsit2);// 报错
        getElement2(lsit3);
        getElement2(lsit4);

        /*
        类与类之间的继承关系
            Integer extends Number extends Object
            String extends Object
         */




    }
    // 泛型的上限，此时的泛型，必须是Number类型或者NUmber类型的子类
    public static void getElement1(Collection< ? extends Number> coll){};
    // 泛型的下限，此时的泛型必须是Number类型或者Nuber类型的父类
    public static void getElement2(Collection<? super Number>coll){};
}
