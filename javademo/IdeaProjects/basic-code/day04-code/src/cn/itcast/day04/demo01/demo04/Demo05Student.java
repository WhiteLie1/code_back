package cn.itcast.day04.demo01.demo04;

public class Demo05Student {
    public static void main(String[] args) {
        standardStudent stu1 = new standardStudent();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("姓名："+stu1.getName()+"年龄："+stu1.getAge());

        standardStudent stu2 = new standardStudent("古力娜扎",32);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
        stu2.setAge(100);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());

    }
}
