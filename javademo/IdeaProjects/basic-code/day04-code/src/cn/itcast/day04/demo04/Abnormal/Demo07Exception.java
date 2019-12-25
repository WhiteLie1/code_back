package cn.itcast.day04.demo04.Abnormal;
/*
    如果finally中有return语句，永远返回finally中的结果，避免该情况
 */
public class Demo07Exception {
    public static void main(String[] args) {
        int a  = getA();
        System.out.println(a); // 永远返回 100
    }
    // 定义一个方法，返回A的值
    public static int getA(){
        int a = 10;
        try{
            return a ;
        }catch(Exception e){
            System.out.println(e);
        }finally {
            // 一定会执行的代码
            a = 100;
            return a;
        }
    }
}
