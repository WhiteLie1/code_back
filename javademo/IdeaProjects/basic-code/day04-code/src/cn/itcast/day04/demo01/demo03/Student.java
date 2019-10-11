package cn.itcast.day04.demo01.demo03;
/*
定义的一个类来组成学生：
属性（是什么），
姓名：
年龄：
行为（能做什么）：
吃饭
学习
睡觉

 */
public class Student {
    String name;
    int age;

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
