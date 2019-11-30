package cn.itcast.day04.demo03.List;
/*
可变参数： jdk1.5版本之后的新特性
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
        int i =add(1);
        System.out.println("i是"+i); // i是0
    }
    /*
    定义计算（0-n)个整数和的方法
        已知：计算整数的和，数据类型已经确定了，但是参数的个数不确定
     */
    private static int add(int ...array) {
//        System.out.println("array"+array); //array[I@4c203ea1
//        System.out.println(array.length); // 0
        // 定义一个初始化的变量，记录累加求和
        int sum = 0;
        // 遍历数组，获取数组中的每一个元素
        for (int i :array){
            // 累加求和
            sum +=i;
        }
        return sum;
    }

//    private static int add(int a,int b) {
//        return a+b;
//    }
}
