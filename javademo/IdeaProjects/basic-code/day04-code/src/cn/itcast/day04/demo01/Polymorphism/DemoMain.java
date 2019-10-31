package cn.itcast.day04.demo01.Polymorphism;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标供电脑使用
//        Mouse mouse = new Mouse();
        //首先进行向上转型
        USB usbMouse = new Mouse(); // 多态写法
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是实现类，传递进去的是 实现类对象
        computer.useDevice(keyboard);

        computer.powerOff();
        System.out.println("=============================");
    }
}
