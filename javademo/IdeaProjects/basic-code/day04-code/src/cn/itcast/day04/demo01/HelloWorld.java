package cn.itcast.day04.demo01;//包名字
/*
复习此前学习的方法基础入门知识：
方法其实就是若干语句的功能集合。
方法好比是一个工厂。
蒙牛工厂 原料：奶牛，饲料
钢铁工厂：原料：铁矿石、煤炭

参数（原料）：就是进入方法的数据
返回值（产出物）：就是从方法中出来的数据

定义方法的完整格式：
修饰符 返回值类型 方法名称（参数类型 参数名称，。。。）{
    方法体
    return 返回值；
}
修饰符：现阶段的固定写法是：public static
返回值类型：也就是方法最终产生的数据结果是什么类型
方法名称：方法的名字，规则和变量一样，小驼峰
参数类型：进入方法的数据是什么类型
参数名称:进入方法的数据对应的变量名称
ps:参数如果有多个，使用逗号进行分隔
方法体：方法需要做的事情，若干行代码
return:两个作用，第一停止当前方法，第二将后面的结果数据返回给调用处
返回值：也就是方法执行后最终产生的数据结果

注意：return 后面的返回值 必须和方法前面的返回值类型，保持对应

方法的三种调用格式：
1.单独调用：方法名称（参数）
2.打印调用：System.out.println()
3.赋值调用
 */
/*public class HelloWorld {
    public static void main(String[] args) {
        //调用方法
        sum(1,2);

        System.out.println(sum(1,2));//打印调用方法
//        PrintMethod();
        //打印矩形
//        for (int i = 1 ;i <= 5 ;i++){
//            for (int j = 1 ;j<= 20 ;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    }
    public static void PrintMethod() {
        for (int i = 1 ;i <= 5 ;i++){
            for (int j = 1 ;j<= 20 ;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //两个int相加
    public static int sum(int a,int b) {
        return (a+b);
    }


}*/
/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数。
例如两个数字相加，必须知道两个数字各自多少，才能相加。
无参数：
 */
public class HelloWorld {
    public  static void main(String[] args){
        method1(10,20);
        System.out.println("************");
        method2();
        //main方法来调用方法
        int num = getSum(10,20);
        System.out.println("返回值是："+num);
        System.out.println("=============");
        printSum(10,10);

    }
    //两个数字相乘，参数必须有
    public static void method1(int a ,int b) {
        int result = a * b;
        System.out.println("结果是："+result);
    }
    //打印输出固定10次文本字符串
    public static void method2(){
        for(int i = 0;i<10;i++){
            System.out.println("Hello,World!"+i);
        }
    }

    //定义一个方法，求出两个方法之和：
    //我是一个方法，我负责两个数相加
    //我有返回值int ，谁调用我，我就把计算结果告诉谁
    public static int getSum(int a,int b){
        int result = a+b;
        return result;
    }
    //两个数字相加，没有返回值
    public static void printSum(int a ,int b){
        int result = a+b;
        System.out.println("结果是："+result);
    }


}
