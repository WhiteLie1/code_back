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
        //判断一下接口，再进行转型操作
        if(usb instanceof Mouse){//一定要先判断
            Mouse mouse = (Mouse)usb;//向下转型
            mouse.click();
        }else if( usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.type();
        }
        usb.close();//关闭设备
    }
}
