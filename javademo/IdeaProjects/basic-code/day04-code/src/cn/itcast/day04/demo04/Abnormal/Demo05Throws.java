package cn.itcast.day04.demo04.Abnormal;

import java.io.FileNotFoundException;
import java.lang.module.FindException;

public class Demo05Throws {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("c:\\a.txt");
    }
    /*
        定义一个方法，对传递的文件的路径进行合法性判断

     */
    private static void readFile(String fileName) throws FileNotFoundException {
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递文件路径错误！");
        }
        System.out.println("路径没问题，读取文件！");
    }

}
