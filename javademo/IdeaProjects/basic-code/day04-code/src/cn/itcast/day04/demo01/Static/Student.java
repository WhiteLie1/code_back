package cn.itcast.day04.demo01.Static;

public class Student {
    private int id;//学号
    private String name;
    private int age;
    static String room;//所在的教室
    private static int idCounter=0;
    //private static int idCount=0;//学号计数器，每当new了 一个新的对象的时候，计数器+1

    public Student() {
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
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
