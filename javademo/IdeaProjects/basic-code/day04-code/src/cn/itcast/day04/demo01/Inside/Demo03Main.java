package cn.itcast.day04.demo01.Inside;

public class Demo03Main {
    public static void main(String[] args) {
        // 创建角色
        Hero hero = new Hero();
        // 起名 设年龄
        hero.setName("悟空");
        hero.setAge(20);
        // 创建一个武器对象
        Weapon weapon = new Weapon("龟派气功");
        // 给英雄配置武器
        hero.setWeapon(weapon);
        // 决斗
        hero.attack();


    }
}
