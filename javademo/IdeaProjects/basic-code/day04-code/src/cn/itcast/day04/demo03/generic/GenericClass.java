package cn.itcast.day04.demo03.generic;
/*
定义一个含有泛型的类，模拟Arraylist集合

 */
public class GenericClass<E> {
    private E name;

    public GenericClass() {
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
