package cn.itcast.day04.demo01.String;

/**
 * ==是进行对象的地址值得比较，如果确实需要字符串的内容比较，可以使用两个方法
 * public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false
 * 注意事项：
 * 1.任何对象都能用Object进行接收，
 * 2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
 * 3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面
 * 推荐：“abc".equals(str) 不推荐：str.equals("abc")
 * public boolean equals(str) 不推荐：str.equalsIgnoreCase(String str);忽略大小写，进行内容的比较
 */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

    }

}
