package cn.itcast.day04.demo01.String;
/*
String当中与获取相关的常用方法有：
concat 将当前字符串和参数字符串拼接成为返回值新的字符串

 */
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "sdksljfsklgjaklgjeagjeaogjeaorgj".length();
        System.out.println("字符串的长度为："+length);
        //拼接字符串
        String str1 = "Hello";
        String str2 = "World!";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //获得制定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("1号位置的是："+ch);
        System.out.println("**********************");
        //查找参数字符串在本来字符串当中出现的第一次索引的位置
        String original = "HelloWorld";
        int index=original.indexOf("llo");
        System.out.println("第一次索引值是i:"+index);

        System.out.println("HelloWorld".indexOf("sdkj"));

    }
}
