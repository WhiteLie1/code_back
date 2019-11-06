package cn.itcast.day04.demo01.Final;
/*
final关键字代表最终，不可改变的。
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1); // 10
        num1 = 20;
        System.out.println(num1); // 20

        //一旦使用final关键字来修饰局部变量，那么这个变量就不能进行更改
        //一次赋值，终身不变
        final int num2 = 200;
        System.out.println(num2);
//        num2 = 300; 错误的写法，不能改变
//        num2 = 200;
        //正确写法，只要保证还有唯一的一次赋值即可
        final int num3;
        num3 = 30;

        //对于基本类型来说，不可改变说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是 变量中的地址值不可改变
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        stu1 = new Student("霍建华");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        //写法对比
        final Student stu2 = new Student("高圆圆");
        //错误写法,final的引用类型变量，其中的地址不能改变
//        stu2 = new Student("zhaodi ldkfj");
        System.out.println(stu2.getName());

        stu2.setName("搞挂机了空间看");
        System.out.println(stu2.getName());




    }

}
