package cn.itcast.day04.demo02.StringBuilder;
/*
StringBuilder和 String相互转换
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        // string --> stringBuilder
        String str = "Hello";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        System.out.println("bu:"+bu);
        // 往StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu:"+bu);

        // StringBuilder->string
        String s = bu.toString();
        System.out.println("s:"+s);

    }
}
