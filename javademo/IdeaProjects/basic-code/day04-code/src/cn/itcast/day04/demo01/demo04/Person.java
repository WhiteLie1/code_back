package cn.itcast.day04.demo01.demo04;
/*
定义person的时候，无法阻止不合理的数值被设置进来
解决方案：使用private进行修饰，那么本类中还是可以随意访问，但是超出了本类的范围外就不能直接访问了
间接访问private成员变量，就是定义一对 get/set方法
 */
public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫："+name+"年龄"+age);
    }
    public void setAge(int num){
        if(num<100&&num>0){
            age = num;
        }else{
            System.out.println("数据不合理！");
        }

    }
    public int getAge(){
        return age;
    }
}
