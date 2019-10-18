package cn.xycode.day06LogInSystem.subCode;

/**
 * @program: User
 * @Description: declare class User
 * @author: Mr.Ma
 * @date: 2019/10/16 8:00 下午
 */

public class User {

    private String name;
    private String password;

    public User() {
    }


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
