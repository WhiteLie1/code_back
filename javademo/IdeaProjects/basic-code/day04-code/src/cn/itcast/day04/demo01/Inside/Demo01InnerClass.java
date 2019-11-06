package cn.itcast.day04.demo01.Inside;
/*
如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类。
例如：身体和心脏 汽车和发动机的关系

分类：
1.成员内部类
2.局部内部类，（包含匿名内部类）
成员内部类定义格式：
修饰符 class 外部类名称{
    修饰符 class 内部类名称{
        //....
    }
    //...
}
注意：
内用外，随意访问，外用内，需内部类对象

==============================
如何使用成员内部类
 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body(); // 外部类对象
        // 通过外部类的对象，调用外部类的方法，在里面间接使用内部类Heart
        body.methodBody();

        System.out.println("==================");
        // 按照公式写
        Body.Heart heart = new Body().new Heart();
        heart.heat();

    }

}



















