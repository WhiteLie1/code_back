package cn.itcast.day04.demo01.demo04;
/*

 */
public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
//        person.show();
        person.name="fjakjflk";
//        person.age=18;
        person.setAge(-20);
        person.setMale(true);
        person.show();
        System.out.println("是不是爷们："+person.isMale());

    }

}
