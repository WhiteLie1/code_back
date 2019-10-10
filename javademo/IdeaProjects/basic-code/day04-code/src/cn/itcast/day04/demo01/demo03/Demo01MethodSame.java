package cn.itcast.day04.demo01.demo03;
/*
题目：定义要给方法，用来判断两个数字是否相同
 */
public class        Demo01MethodSame {
    public static void main(String[] args){
//        System.out.println(isSame(10,10));; //判断两个值是否相等
//        System.out.println("结果是："+getSum());

    }
    //判断两个值是否相同的方法
    public static boolean isSame(int a,int b){
        boolean same;
        /*if(a==b){
            same = true;
        }else{
            same = false;
        }*/
        same = a == b ? true : false;
         //boolean same = a==b;
        return same;
        //return a==b;
    }
    //求出1-100的结果
    public static int getSum(){
        int sum = 0;
        for(int i = 1;i<=100;i++){
            sum +=i;
        }
        return sum;
    }

}
