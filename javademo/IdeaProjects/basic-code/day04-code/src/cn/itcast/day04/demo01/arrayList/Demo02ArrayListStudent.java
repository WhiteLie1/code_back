package cn.itcast.day04.demo01.arrayList;

import java.util.ArrayList;

/*
自定义四个学生对象，并添加到集合，并遍历
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student one = new Student("洪七公",22);
        Student two = new Student("欧阳锋",28);
        Student three = new Student("黄药师",39);
        Student four = new Student("段执行",23);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名："+stu.getName()+"年龄："+stu.getAge());

        }


    }
}
