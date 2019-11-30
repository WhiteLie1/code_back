package cn.itcast.day04.demo03.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    comparator和comparable的区别
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);// 1,3,2

        Collections.sort(list01, new Comparator<Integer>() {
            // 重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2; // 升序
//                return o2-o1; // 降序
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("a迪丽热巴",18));
        list02.add(new Student("古力娜扎",20));
        list02.add(new Student("a杨幂",17));
        list02.add(new Student("b迪丽热巴",18));
        System.out.println("未处理前："+list02);
        /*Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按照年龄升序来排序
                return o1.getAge()-o2.getAge();
            }
        });*/

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按照年龄升序来排序
                int result =  o1.getAge()-o2.getAge();
                // 如果两个人年龄相同，再使用姓名的第一个字比较
                if(result==0){
                    result = o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;

            }
        });


        System.out.println("处理后："+list02);

    }

}
