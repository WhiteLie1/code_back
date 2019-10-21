package cn.itcast.day04.demo01.String;
/*
substring(int index):截取存参数位置一直到字符串末尾
substring(int begin,int end)截取从begin到end中间的字符
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("==============");
        String str3 = str1.substring(4,7);
        System.out.println(str3);
    }
}
