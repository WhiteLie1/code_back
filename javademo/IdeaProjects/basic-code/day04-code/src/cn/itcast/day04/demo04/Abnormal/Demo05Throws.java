package cn.itcast.day04.demo04.Abnormal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.FindException;

public class Demo05Throws {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        readFile("c:\\a.txt");
        System.out.println("后续代码。。。");
    }
    /*
        定义一个方法，对传递的文件的路径进行合法性判断

     */
    private static void readFile(String fileName) throws FileNotFoundException,IOException {
        if(!fileName.equals("c:\\a.tt")){
            throw new FileNotFoundException("传递文件路径错误！不是a.txt");

        }
//        System.out.println("路径没问题，读取文件！");

        /*
            如果传递的路径不是.txt结尾，那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
         */
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对！ ");
        }
    }

}
