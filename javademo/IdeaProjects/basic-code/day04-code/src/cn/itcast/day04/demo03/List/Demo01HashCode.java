package cn.itcast.day04.demo03.List;
/*

 */
public class Demo01HashCode {
    public static void main(String[] args) {
        // person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);
        /*
        toString 源码
             public String toString() {
                        return getClass().getName() + "@" + Integer.toHexString(hashCode());
                }
         */
        System.out.println(p1);
        System.out.println(p2); //  cn.itcast.day04.demo03.List.Person@5f150435

        /*
            String类的哈希值
                Stringl类重写object类的hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("-------------------");
        System. out.println("重地".hashCode());
        System.out.println("通话".hashCode());


    }
}
