package cn.itcast.day04.demo01.anonymous;

/**
 * 创建对象标准格式：
 * 类名称 对象名 = new 类名称();
 * 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
 * new 类名称（）；
 *注意事项：匿名对象只能使用唯一一次，下次再使用不得不再创建一个新的对象
 * 使用建议：
 * 如果确定有一个对象只需要使用一次
 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();
        System.out.println("================");
        //对象
        new Person().name="男神";
        new Person().showName();//我叫：null


    }
}
