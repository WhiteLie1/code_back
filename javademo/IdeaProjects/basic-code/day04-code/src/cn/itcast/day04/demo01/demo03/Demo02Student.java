package cn.itcast.day04.demo01.demo03;


/*
对于和当前类属于同一个包的情况，可以省略导包语句不写
 */
public class Demo02Student {


    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("***********");
        stu.name="赵丽颖";
        stu.age=18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("***********");
        //使用成员方法
        stu.eat();
        stu.sleep();
        stu.study();

    }
}
