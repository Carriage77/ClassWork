package cn.xycode.day06;

public class User {

    private String name;
    private String passwork;

    public User() {
    }

    public User(String name, String passwork) {
        this.name = name;
        this.passwork = passwork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        this.passwork = passwork;
    }



}
