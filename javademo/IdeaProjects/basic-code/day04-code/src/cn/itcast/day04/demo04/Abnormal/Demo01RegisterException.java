package cn.itcast.day04.demo04.Abnormal;

import java.util.Scanner;

/*
    要求：模拟注册请求，如果用户名已存在，则抛出异常并提示：亲，该用户名已被注册
 */
public class Demo01RegisterException {
    // 1.使用数组保存已经注册过的用户名（数据库）
    static String[] usernames = {"张三","李四","王五"};
    public static void main(String[] args) throws RegisterException {
        //2.使用Scanner获取用户输入的注册的用户名（前端，页面）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username = sc.next();
        checkUsername(username);

    }
    //3.定义一个方法，对用户输入中的注册的用户名进行判断
    /*public static void checkUsername(String username) throws RegisterException { //这里抛出异常信息
        // 遍历存储已经注册过用户名的数组，获取每一个用户名
        for (String name : usernames) {
            // 使用获取到的用户名和用户输入的用户名作比较
            if(name.equals(username)){
                // true 用户已经存在
                throw new RegisterException("亲亲，该用户名已经被注册了~");
            }
        }
        // 如果循环完毕，还未找到重复的用户名，则提示恭喜注册成功
        System.out.println("恭喜您注册成功~");
    }*/

    public static void checkUsername(String username)  { //这里抛出异常信息
        // 遍历存储已经注册过用户名的数组，获取每一个用户名
        for (String name : usernames) {
            // 使用获取到的用户名和用户输入的用户名作比较
            if(name.equals(username)){
                try {
                    // true 用户已经存在
                    throw new RegisterException("亲亲，该用户名已经被注册了~");
                }catch(RegisterException e){
                    e.printStackTrace();
                    return;// 结束方法
                }
            }
        }
        // 如果循环完毕，还未找到重复的用户名，则提示恭喜注册成功
        System.out.println("恭喜您注册成功~");
    }
}
