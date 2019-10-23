package cn.itcast.day04.demo01.String;
/*
分割字符串的方法：

 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("=================");
        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("===================");
        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("//.");//不能直接写 . 进行切割
        System.out.println("array3的数组长度为："+array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}
