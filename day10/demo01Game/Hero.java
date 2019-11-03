package cn.xycode.day10.demo01Game;

public class Hero {
    private String name;
    private Weapon weapon;
    private int HP;
    private int MP;

    public Hero(String name, Weapon weapon, int HP, int MP) {
        this.name = name;
        this.weapon = weapon;
        this.HP = HP;
        this.MP = MP;
    }

    public void attack(){
        System.out.println("系统提示："+"<"+name+">"+"使用"+"<"+weapon.getCode()+">"+"对敌方造成了"+"<"+weapon.getPower()+">"+"点伤害");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public Hero() {
    }
}
