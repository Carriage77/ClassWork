package cn.xycode.day10.demo01Game;

public class MainGame {


    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setHP(465);
        hero.setMP(484);
        Weapon weapon = new Weapon();
        weapon.setCode("多兰剑");
        weapon.setPower(200);
        hero.setWeapon(weapon);
        hero.attack();

        Skill skill = new Skill() {
            @Override
            public void Skill() {
                System.out.println("系统提示:"+hero.getName()+"施放了"+"<转转转>");
            }
        };

        skill.Skill();
    }



}
