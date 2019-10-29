package cn.itcast.day04.demo01.Interface;
/*
java8开始，接口里面允许定义默认方法
格式：public default 返回值类型，返回值名称（参数列表）{方法体}

备注：
接口当中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    //新添的一个抽象方法
//    public abstract void methodAbs2();
    //新添加的方法，改成默认方法
    public default  void methodDefault(){
        System.out.println("新添加了一个默认的方法！");
    }
}
