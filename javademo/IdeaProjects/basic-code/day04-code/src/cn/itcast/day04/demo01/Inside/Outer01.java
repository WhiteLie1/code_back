package cn.itcast.day04.demo01.Inside;

public class Outer01 {
    public void methodOuter(){
        class Innel{ // 局部内部类
            int num = 10;
            public void methodInner(){
                System.out.println(num); // 10
            }
        }
    }
}
