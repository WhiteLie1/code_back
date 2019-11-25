package cn.itcast.day04.demo03.generic;
/*
测试含有泛型的接口
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl gi1 = new GenericInterfaceImpl();
        gi1.method("字符串");

        // 创建2的实现对象
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);

        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(8.8);


    }

}
