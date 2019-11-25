package cn.itcast.day04.demo03.generic;

public class Demo03GenericMethod  {
    public static void main(String[] args) {
        GenericaMethod gm = new GenericaMethod();
        /*
            调用含有泛型的方法
         */
        gm.method01(10);
        gm.method01("abc");
        gm.method01(0.1);
        gm.method01(true);
        System.out.println("==========");
        gm.method02("静态方法，不建议创建对象使用");
        // 静态方法，通过类名，方法名（参数）可以直接使用
        GenericaMethod.method02("静态方法");
        GenericaMethod.method02(1);
    }
}
