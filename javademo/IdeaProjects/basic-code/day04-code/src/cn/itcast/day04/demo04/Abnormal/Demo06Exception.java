package cn.itcast.day04.demo04.Abnormal;

import java.util.List;

/*
    多个异常使用捕获该如何处理：
        1.多个异常分别处理
        2.十多个异常一次捕获，多次处理
        3.多个异常一次捕获，一次处理
 */
public class Demo06Exception {
    public static void main(String[] args) {
       /* try{
            int arr[] = {1,2,3};
        System.out.println(arr[3]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("后续代码~");*/

       /*
       一次try捕获多个catch得到
        注意事项：
            catch里面定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则就会报错
        */
        /*try{
            int arr[] = {1,2,3};
            System.out.println(arr[3]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("后续代码~");*/

        /*
            3.多个异常一次捕获一次处理
         */
        try{
            int arr[] = {1,2,3};
            System.out.println(arr[3]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }







    }

}
