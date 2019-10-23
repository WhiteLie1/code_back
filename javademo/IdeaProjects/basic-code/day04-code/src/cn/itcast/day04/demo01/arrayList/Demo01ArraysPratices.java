package cn.itcast.day04.demo01.arrayList;

import java.util.Arrays;

/*
将一个随机字符串中的所有字符升序排列，并倒序打印

 */
public class Demo01ArraysPratices {
    public static void main(String[] args) {
        String str = "sdklsfsklgjkalgj456fkalgk";
        char[] chars = str.toCharArray();
        //升序排列
        Arrays.sort(chars);
        //倒序输出
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
