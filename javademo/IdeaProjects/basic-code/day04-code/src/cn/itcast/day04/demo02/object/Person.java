package cn.itcast.day04.demo02.object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*
    直接打印对象的地址值没有意义，需要重写object类中的toString方法
    打印对象的属性(name,age)
     */
//    public String toString(){
//        return "Person{name="+name+",age="+age+"}";
//    }

    // 编译器自己重写toString方法

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /*
    object类的equals方法，默认比较的是亮哥对象的地址值，没有意义，所以我们要重写equals方法，比较两个对象的属性（name,age）
    问题：
      隐藏着一个多态，
      多态的弊端： 无法使用子类特有的内容（属性和方法）
      object obj = p2 = new Person(古力娜扎，19)
      解决：可以使用向下转型（强转）来把obj的类型转换为person
     */
    // 自己重写的类
//    public boolean equals(Object obj){
//        // 再增加一个判断，传递的参数obj是this的本身
//
//        // 增加一个判断，传递的参数obj如果是null,则直接返回false
//        if(obj == null){
//            return false;
//        }
//        // 加上一个判断，防止类型转换一次 classCastException
//        if(obj instanceof Person){
//            // 使用向下转型，把obj转换为person类型
//            Person p = (Person)obj;
//            // 比较两个对象的属性值，一个对象是this(p1),一个对象是（obj->p2)
//            boolean b = this.name.equals(p.name)&& this.age==p.age;
//            return b;
//        }
//        // 不是Person类型则返回false
//        return false;
//
//    }


    // 系统 自动生成
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass() != o.getClass() 使用反射技术，判断o是不是Person类型 等效于 obj intanceof person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
