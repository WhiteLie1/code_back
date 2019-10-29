package cn.itcast.day04.demo01.Interface;
/*

 */
public interface MyInterfacePrivateB {


    public static void methodStatic1(){
        System.out.println("静态方法1");
        methodStatiCommon();

    }
    public static void methodStatic2(){
        System.out.println("静态方法2");
        methodStatiCommon();
    }
   private static void methodStatiCommon(){ //java9中新出的方法
       System.out.println("AAA");
       System.out.println("BBB");
       System.out.println("CCC");
   }

}
