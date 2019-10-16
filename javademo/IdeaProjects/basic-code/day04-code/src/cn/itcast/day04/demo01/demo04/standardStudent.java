package cn.itcast.day04.demo01.demo04;

/**
 * 一个标准的类要满足下面四个组成部分，
 *   1.所有的成员变量都用private来修饰
 *   2.为每一个成员变量编写一对Getter/Setter方法
 *   3.编写一个无参数的构造方法
 *   4.编写一个有参数的构造方法
 *
 *   这样的标准的类叫做java bean
 *
 */
public class standardStudent {
    private String name;
    private int age;

    public standardStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public standardStudent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
