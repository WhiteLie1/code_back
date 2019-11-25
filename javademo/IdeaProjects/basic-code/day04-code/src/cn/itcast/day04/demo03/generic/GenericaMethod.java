package cn.itcast.day04.demo03.generic;
/*

 */
public class GenericaMethod {
    // 定义一个含有泛型的方法
    public <M> void method01(M m){
        System.out.println(m);

    }
    // 定义一个含有泛型的静态方法
    public static <S> void method02(S s){
        System.out.println(s);
    }
}
