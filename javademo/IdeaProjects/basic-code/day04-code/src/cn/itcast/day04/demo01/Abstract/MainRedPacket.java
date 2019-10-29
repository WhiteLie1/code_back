package cn.itcast.day04.demo01.Abstract;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manager.show();//100
        one.show();//0
        two.show();//0
        three.show();//0
        System.out.println("===========================");
        //群主发红包
        ArrayList<Integer> redList = manager.send(20,3);
        //三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList  );
        manager.show();//100
        one.show();//0
        two.show();//0
        three.show();//0
        System.out.println("===========================");
    }
}
