package cn.itcast.day04.demo01.String;
/*
java.lang.String类代表字符串
API当中说：java程序中所有字符串字面值（“如”abc")都作为此类的实例实现
其实就是说：程序中所有的双引号字符串，都市String类的对象，就算没有new 也照样是

字符串的特点：
1.字符串的内容永不可变
2.正是因为字符串不可改变，所以字符串是可以共享使用的
3.字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组

3+种构造方法：
1.public String():创建一个空白字符串，不含有任何内容
public String(char[] array):根据字符数组的内容，来创建对应的字符串
public String(byte[] array):根据字节数组的内容来创建对应的字符串
直接创建
String str = "sdsf"
注意：直接写上双引号，就是字符串对象
 */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参数构造
        String str1 = new String();
        System.out.println("第一个字符串是："+str1);
        //根据字符数组创建字符串
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串是："+str2);

        //字节数组来创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串是："+str3);

        //直接创建
        String  str4 = "sdsfljk";
        System.out.println(str4);

    }

}





















