package cn.itcast.day04.demo01.demo04;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("===========================");
        Student stu2 = new Student("dssfkj",18);

        System.out.println("姓名："+stu2.getName()+"年龄"+stu2.getAge());
        //如果需要改变对象当中的成员变量的数据内容，还需要使用setXxx方法
        stu2.setAge(21);

    }
}
