package cn.itcast.day04.demo05.demo01.File;

import java.io.File;

/*
    java.io.file类
    文件和目录路径名的抽象表现形式
    操作路径，不能写死了：
    c:\develop\a.txt
     "c:"+"separator"+"develop"+"separator"+"a.txt"
 */
public class Demo01File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);// ; (路径分隔符 windows:分号;linux:冒号)

        String separator = File.separator;
        System.out.println(separator);
    }
}
