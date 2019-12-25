package cn.itcast.day04.demo04.Abnormal;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    finally代码块：
    try{
            可能产生异常的代码
        }catch(定义一个异常的变量，用来接收try中抛出的异常对象)
            {
            异常的处理逻辑，异常对象之后，怎么处理异常对象
            一般在工作中，会把异常的信息记录到一个日志中

        }finally{
            无论是否出现异常，都会执行~
        }
       注意：
        1.finally不能单独使用，必须和try一起使用
        2.finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放
 */
public class Demo02TryCatchFinally {
    public static void main(String[] args) {
        try { // 可能会产生异常的代码
            readFile("d://a.txt");
        } catch (IOException e) { // 异常的处理逻辑
            e.printStackTrace();
        }finally { // 无论是否异常，都会执行
            System.out.println("资源释放 ");
        }
    }

    private static void readFile(String fileName) throws FileNotFoundException, IOException {
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
