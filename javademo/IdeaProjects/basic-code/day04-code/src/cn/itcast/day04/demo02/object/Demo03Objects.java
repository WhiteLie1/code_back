package cn.itcast.day04.demo02.object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = null;
        String s2="abc";
//        boolean b = s1.equals(s2); // java.lang.NullPointerException
        // null 是不能调用方法的，会抛出空指针异常
        /*
        objects中的equals方法，对两个对象进行比较，防止出现空指针异常;

        public static boolean equals(object a,object b){
            return (a==b)||(o!=null && a.equals(b))
        }

         */
        boolean b2 = Objects.equals(s1,s2);
        System.out.println(b2);
    }
}
