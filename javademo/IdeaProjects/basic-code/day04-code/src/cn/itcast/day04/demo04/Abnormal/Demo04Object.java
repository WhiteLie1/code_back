package cn.itcast.day04.demo04.Abnormal;

import java.util.Objects;

/*
    Object类中的静态方法

 */
public class Demo04Object {
    public static void main(String[] args) {
     method(null);
    }

    public static void method(Object obj) {
        // 对传递过来的参数进行合法性判断，判断是否为null
        /*if(obj == null){
            throw new NullPointerException("传递的对象的值是NULL");
        }*/
        Objects.requireNonNull(obj);
    }
}
