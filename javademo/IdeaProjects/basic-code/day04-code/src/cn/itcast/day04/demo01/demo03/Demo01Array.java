package cn.itcast.day04.demo01.demo03;
/*
数组：是一种容器，可以同时存放多个数据值
数组的特点：
1.数组是一种引用数据类型
2.数组当中的多个数据，类型必须统一
3.数组的长度在程序运行期间不可改变

数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值
两种常见的初始化方式：
1.动态初始化（指定长度）
2.静态初始化（指定内容）

动态初始化数组的格式
数据类型[] 数组名称 = new 数据类型[数组长度]
解析含义：
左侧数据类型：也就是数组中保存的数据，全都是统一的什么类型
左侧的中括号：代表我是一个数组
左侧的数组名称;给数组取一个名字
右侧的new :代表创建数组的动作
右侧的数据类型：必须和左边的数据类型保持一致
右侧中括号的长度，也就是数组中，到底可以保存多少个数据，是一个int数字

静态初始化：在创建数组的时候，不直接指定数据的个数的多少，而是直接将具体的数据内容进行指定
静态初始化的基本格式（标准格式）:
数据类型[] 数组名称 = new 数据类型[] {元素1，元素2，};
省略格式：
数据类型[] 数组名称 = {元素1，元素2，}
注意事项：
虽然静态初始化没有直接告诉长度，但是根据大括号里面的元素的具体内容，也可以自动推算
静态初始化标准格式可以拆分成为两个步骤
动态初始化标准格式可以拆分成为两个步骤

直接打印数组名称，得到的是数组对应的，内存地址哈希值
访问数组元素的格式：数组名称[索引值]
注意：索引值从0开始，一直到“数据的长度-1”为止

 */
/*
遍历数组：说的就是对数组中的每一个元素进行逐一、挨个儿处理，默认的处理方式就是打印输出

 */
public class Demo01Array {
    public static void main(String[] args) {
        /*int[] array = {10, 20, 30};
//        System.out.println(array[0]);//[I@71e7a66b [代表是一个数组，I代表这是一个int类型，@
        for(int i = 0;i<array.length;i++){
            System.out.println("数组是："+array[i]);
        }*/

        //求最大值
//        int array[] = {5,15,30,20,10000};
//
//        int max = array[0];
//        for(int i = 1 ;i<array.length;i++){
//            if(array[i]>max){
//                max = array[i];
//            }
//
//        }
//        System.out.println("最大值是："+max);

        //数组的逆向
        int array[] = {34,11,46,78,98,34,35};
        System.out.print("原数组是：");
        for(int i = 0;i < array.length ;i++){

            System.out.print(array[i]+" ");
        }
        System.out.println("***************");
        for(int min=0,max=array.length-1;min<max;max--,min++){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        System.out.print("后来的数组是：");
        for(int i = 0;i < array.length ;i++){

            System.out.print(array[i]+" ");
        }







    }

}



















