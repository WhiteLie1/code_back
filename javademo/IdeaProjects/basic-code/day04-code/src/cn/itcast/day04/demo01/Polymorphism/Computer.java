package cn.itcast.day04.demo01.Polymorphism;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本开机");
    }
    public void powerOff(){
        System.out.println("笔记本关机");
    }

    //使用设备的方法,使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();//打开设备

        usb.close();//关闭设备
    }
}
