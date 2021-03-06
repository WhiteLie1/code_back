package cn.itcast.day04.demo04.lambda;
/*
    需求：
        给定一个厨子cook接口，内含唯一的抽象方法makeFood,且无参数，无返回值
        使用Lambda的标准格式调用invokeCook方法，打印输出“”
 */
public class Demo01Cook {
    public static void main(String[] args) {
        // 调用invokeCook方法，参数是Cook接口，传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了！");
            }
        });

        // 使用Lambda的方法简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("起床吃饭！");
        });

        // 优化省略Lambda代码
        invokeCook(()->
            System.out.println("起床吃饭！")
        );



    }

    // 定义一个方法，参数传递cook接口，方法内部调用cook接口中的makeFood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
    

}
