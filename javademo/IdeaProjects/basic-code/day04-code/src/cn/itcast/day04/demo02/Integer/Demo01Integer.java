package cn.itcast.day04.demo02.Integer;
/*
装箱：把基本类型的数据，包装到包装类中去（基本类型的数据--> 包装类)
 */
public class Demo01Integer {
    public static void main(String[] args) {
        // 构造方法
        Integer in1  = new Integer(1); // 出现了横线，说明方法过时了
        System.out.println(in1); // 没有打印地址则说明重写了构造方法

        Integer in2 = new Integer("1");
        System.out.println(in2);

        // 静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

//        Integer in4 =  Integer.valueOf("a"); // java.lang.NumberFormatException: For input string: "a" 数字格式化异常
        Integer in4 =  Integer.valueOf("1");

        System.out.println(in4);

        // 拆箱 : 在包装类中取出基本类型的数据,(包装类->基本数据类型的数据)
        int i = in1.intValue();
        System.out.println(i);


    }
}
