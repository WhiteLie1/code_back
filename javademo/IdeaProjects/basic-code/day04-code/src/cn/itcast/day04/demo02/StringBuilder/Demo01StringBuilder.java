package cn.itcast.day04.demo02.StringBuilder;
/*

 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        // 空参数构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);

        // 带字符串的构造方法
        StringBuilder bu2  = new StringBuilder("abc");
        System.out.println("bu2:"+bu2 );
    }
}
