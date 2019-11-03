package cn.xycode.day10.demo01Game;

public class Weapon {
    private String code;
    private int power;

    public Weapon(String code, int power) {
        this.code = code;
        this.power = power;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Weapon() {
    }
}
