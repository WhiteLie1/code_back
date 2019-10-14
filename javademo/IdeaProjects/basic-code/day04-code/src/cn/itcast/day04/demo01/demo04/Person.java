package cn.itcast.day04.demo01.demo04;
/*
定义person的时候，无法阻止不合理的数值被设置进来
解决方案：使用private进行修饰，那么本类中还是可以随意访问，但是超出了本类的范围外就不能直接访问了
间接访问private成员变量，就是定义一对 get/set方法

必须使用getXXX或者setXXX的命名规则
对于基本类型当中的boolean的值，Getter方法一定要写成isXxx的形式，而setXxx规则不变
 */
public class Person {
    String name;
    private int age;
    private boolean male;//是不是爷们儿

    public void setMale(boolean b){
        male = b;
    }
    public boolean isMale(){
        return male;
    }

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
