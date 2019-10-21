package cn.itcast.day04.demo01.String;
/*

 */
public class Demo03StringConvert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("================");
        //转换为字节数组
        byte[] bytes="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println("================");
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);

        String lang1 = "会不会玩儿啊，你大爷的！";
        String str3 = lang1.replace("你大爷的","****");
        System.out.println(lang1);
        System.out.println(str3);
    }
}
