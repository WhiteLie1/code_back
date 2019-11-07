package cn.itcast.day04.demo01.Inside;

public class Hero1 {
    private String name; // 英雄名称
    private Skill1 skill1; // 英雄技能

    public Hero1() {
    }

    public Hero1(String name, Skill1 skill1) {
        this.name = name;
        this.skill1 = skill1;
    }
    // 攻击技能
    public void attack(){
        System.out.println("我叫"+name+",开始释放技能：");
        // 这里是，在用，接口来调用接口当中的抽象方法
        skill1.use(); // 调用接口中的抽象方法
        System.out.println("释放技能完成");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill1 getSkill1() {
        return skill1;
    }

    public void setSkill1(Skill1 skill1) {
        this.skill1 = skill1;
    }
}
