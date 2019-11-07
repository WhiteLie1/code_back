package cn.itcast.day04.demo01.Inside;

public class DemoGame1 {
    public static void main(String[] args) {
        Hero1 hero1 = new Hero1();
        hero1.setName("艾希"); // 英雄名称的设置

        // 设置英雄技能
//        hero1.setSkill1(new SkillImpl()); // 使用单独定义的实现类
//        hero1.attack();
        // 还可以改成使用匿名内部类
//        Skill1 skill1 = new Skill1() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia~");
//            }
//        };
//        hero1.setSkill1(skill1);
        // 进一步简化，同时使用匿名内部类和匿名对象
        hero1.setSkill1(new Skill1() {
            @Override
            public void use() {
                System.out.println("Biu~Pia~Biu~Pia~");
            }
        });
        hero1.attack();
    }
}
