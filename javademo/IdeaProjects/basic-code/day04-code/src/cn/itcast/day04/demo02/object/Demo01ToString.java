package cn.itcast.day04.demo02.object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
java.lang.object
类object是类层次结构的根（父类）
每个类（Person，student）都使用object（作为父类）
所有对象，包括数组都实现这个类的方法
 */
public class Demo01ToString {


    public static void main(String[] args) {
        // person类默认继承了object类，所以可以使用object类中的toString方法
//        String toString() 返回该对象的字符串表示
        Person p = new Person("张三",17);
        String s = p.toString();
        System.out.println(s); // cn.itcast.day04.demo02.object.Person@2ac1fdc4

        // 直接打印对象的名字就是调用toString方法 toString p = p.toString()
        System.out.println(p);

        // 看一个类是否重写了tostring的方法，直接打印这个类的对象即可，如果没有重写toString方法，那么打印的就是对象的地址值
        Random r = new Random();
        System.out.println(r);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc); //java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\,][decimal separator=\.][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);




    }
}
