package cn.itcast.day04.demo01.Extends;
/*
在继承的关系中，子类就是一个父类，也就是说，子类可以被当做父类看待
例如：父类是员工，子类是讲师，那么讲师就是一个员工
 */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建了一个子类对象
        Teacher teacher = new Teacher();
        //Teacher当中虽然什么都没写，但是会继承来自父类的method方法
        teacher.method();

        //创建另一个子类助教
        Assistant assistant = new Assistant();
        assistant.method();

    }
}
