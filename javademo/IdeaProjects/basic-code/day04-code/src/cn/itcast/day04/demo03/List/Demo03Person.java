package cn.itcast.day04.demo03.List;

import java.util.Objects;

public class Demo03Person {
    private String name;
    private int age;

    public Demo03Person() {
    }

    @Override
    public String toString() {
        return "Demo03Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Demo03Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo03Person that = (Demo03Person) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
